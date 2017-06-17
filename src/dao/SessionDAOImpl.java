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
		// TODO �Զ����ɵķ������
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
				System.out.println("����ɹ�");
			} catch (SQLException e) {
				e.printStackTrace();
				if (e.getErrorCode() == 19) {
					System.out.println("�����ظ�");
					res -= 1;

				}
				res -= 1;
				System.out.println("����ʧ��");
			}
			stmt.close();
		} catch (SQLException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		return new Session(sid, userid, timenow);

	}

	public int destroySessionByUID(int uid) {
		// TODO �Զ����ɵķ������
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
		String sql = " DELETE FROM Session WHERE UID = " + uid;
		
		try {
			if (stmt.executeUpdate(sql) == 0) {
				System.out.println("�Ҳ���Ŀ���¼");
				res = -2;
			} else {
				System.out.println("ɾ���ɹ�");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ��ʧ��");
			res = -1;
		}
		stmt.close();
		} catch (SQLException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		return res;
	}

	public int destroySessionByID(String id) {
		// TODO �Զ����ɵķ������
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
		String sql = " DELETE FROM Session WHERE ID = '" + id+"'";
		System.out.println(sql);
		try {
			if (stmt.executeUpdate(sql) == 0) {
				System.out.println("�Ҳ���Ŀ���¼");
				res = -2;
			} else {
				System.out.println("ɾ���ɹ�");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ��ʧ��");
			res = -1;
		}
		stmt.close();
		} catch (SQLException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		return res;
	}

	public Map<String, Boolean> checkSession(Session session) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public int destroySessionByUID(String id) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	public int destroySessionByID(int uid) {
		// TODO �Զ����ɵķ������
		return 0;
	}

}
