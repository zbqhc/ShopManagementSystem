package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import tools.EncoderHash;
import tools.Timenow;

public class SessionDAOImpl implements SessionDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();

	public Session getSession(int userid) {
		// TODO 自动生成的方法存根
		String timenow = Timenow.getTimeNow();

		String sid = EncoderHash.encode("SHA1", userid + timenow);
		Statement stmt;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO Session (ID,UID,TIMESTAMP) "
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
		return new Session(sid, userid, timenow);

	}

	public int destroySessionByUID(int uid) {
		// TODO 自动生成的方法存根
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
		String sql = " DELETE FROM Session WHERE UID = " + uid;
		
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

	public int destroySessionByID(String id) {
		// TODO 自动生成的方法存根
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
		String sql = " DELETE FROM Session WHERE ID = '" + id+"'";
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

	public Map<String, Boolean> checkSession(Session session) {
		// TODO 自动生成的方法存根
		return null;
	}

	public int destroySessionByUID(String id) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public int destroySessionByID(int uid) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
