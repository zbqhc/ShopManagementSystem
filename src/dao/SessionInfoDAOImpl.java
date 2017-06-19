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
		// TODO �Զ����ɵķ������
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
		return new SessionInfo(sid, userid, timenow);

	}

	public int destroySessionInfoByUID(int uid) {
		// TODO �Զ����ɵķ������
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
		String sql = " DELETE FROM SessionInfo WHERE UID = " + uid;
		
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

	public int destroySessionInfoByID(String id) {
		// TODO �Զ����ɵķ������
		Statement stmt;
		int res = 0;
		try {
			stmt = conn.createStatement();
		String sql = " DELETE FROM SessionInfo WHERE ID = '" + id+"'";
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

	public Map<String, Boolean> checkSessionInfo(SessionInfo sessionInfo) {
		// TODO �Զ����ɵķ������
		
		return null;
	}

	public int destroySessionInfoByUID(String id) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	public int destroySessionInfoByID(int uid) {
		// TODO �Զ����ɵķ������
		return 0;
	}

}
