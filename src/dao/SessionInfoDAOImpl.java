package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import tools.EncoderHash;
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
		String sql = " DELETE FROM SessionInfo WHERE ID = '" + id+"'";
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

	public Map<String, Boolean> checkSessionInfo(SessionInfo sessionInfo) {
		// TODO 自动生成的方法存根
		
		return null;
	}

	public int destroySessionInfoByUID(String id) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int destroySessionInfoByID(int uid) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
