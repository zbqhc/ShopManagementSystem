//已修改 date:20170620 19:41
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.sun.crypto.provider.RSACipher;

import tools.EncoderHash;
import tools.Pertran;
import tools.Timenow;

public class SessionInfoDAOImpl implements SessionInfoDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();

	public SessionInfo getSessionInfo(int userid) {
		// TODO 自动生成的方法存根
		String timenow = Timenow.getTimeNow();

		String sid = EncoderHash.encode("SHA1", userid + timenow);
		Statement stmt;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO SessionInfo (ID,UID,TIMESTAMP) "
					+ "VALUES ('" + sid + "'," + userid + ",'" + timenow
					+ "');";
			int res = 0;
			try {
				System.out.println(sql);
				stmt.executeUpdate(sql);
				System.out.println("插入成功");
			} catch (SQLException e) {
				e.printStackTrace();
				if (e.getErrorCode() == 19) {
					System.out.println("主键重复");
					res -= 1;

				}
				res -= 1;
				System.out.println("插入失败");
			}
			stmt.close();
		} catch (SQLException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		return new SessionInfo(sid, userid, timenow);

	}

	public int destroySessionInfoByUID(int uid) {
		// TODO 自动生成的方法存根
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
			String sql = " DELETE FROM SessionInfo WHERE UID = " + uid;

			try {
				if (stmt.executeUpdate(sql) == 0) {
					System.out.println("找不到目标记录");
					res = -2;
				} else {
					System.out.println("删除成功");
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("删除失败");
				res = -1;
			}
			stmt.close();
		} catch (SQLException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		return res;
	}

	public int destroySessionInfoByID(String id) {
		// TODO 自动生成的方法存根
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
			String sql = " DELETE FROM SessionInfo WHERE ID = '" + id + "'";
			System.out.println(sql);
			try {
				if (stmt.executeUpdate(sql) == 0) {
					System.out.println("找不到目标记录");
					res = -2;
				} else {
					System.out.println("删除成功");
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("删除失败");
				res = -1;
			}
			stmt.close();
		} catch (SQLException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		return res;
	}

	public Map<String, Boolean> checkSessionInfo(String sessionID)
			throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;
		String sql0 = "SELECT * FROM UserInfo WHERE ID="
				+ queryBySSID(sessionID);
		ResultSet rs = stmt.executeQuery(sql0);

		sql = "SELECT * FROM DepatrmentInfo WHERE ID=" + rs.getInt("HEADSHIP");
		rs.close();
		stmt.close();
		
		System.out.println(sql);
		Statement stmt2 = conn.createStatement();
		ResultSet rs2 = stmt2.executeQuery(sql);
		
		System.out.println("ueser权限    " + rs2.getString("NAME"));
		Map<String, Boolean> perMap = new HashMap<String, Boolean>();
		perMap.put("人事管理", Pertran.pertran(rs2.getInt("P0")));
		perMap.put("销售管理", Pertran.pertran(rs2.getInt("P1")));
		perMap.put("退货管理", Pertran.pertran(rs2.getInt("P2")));
		perMap.put("采购管理", Pertran.pertran(rs2.getInt("P3")));
		perMap.put("库存管理", Pertran.pertran(rs2.getInt("P4")));
		perMap.put("账本管理", Pertran.pertran(rs2.getInt("P5")));
		perMap.put("供应商管理", Pertran.pertran(rs2.getInt("P6")));
		perMap.put("用户管理", Pertran.pertran(rs2.getInt("P7")));
		perMap.put("权限管理", Pertran.pertran(rs2.getInt("P8")));
		rs2.close();
		stmt2.close();
		return perMap;
	}

	public int queryBySSID(String sessionID) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		int userid;
		try {
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM SESSIONINFO WHERE ID='"
							+ sessionID + "'");
			userid = Integer.valueOf(rs.getString("UID"));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("查询失败");
			stmt.close();
			return 0;
		}

		return userid;
	}

}
