//���޸� date:20170620 19:41
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
			String sql = " DELETE FROM SessionInfo WHERE ID = '" + id + "'";
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

	public Map<String, Boolean> checkSessionInfo(String sessionID)
			throws SQLException {
		// TODO �Զ����ɵķ������
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
		
		System.out.println("ueserȨ��    " + rs2.getString("NAME"));
		Map<String, Boolean> perMap = new HashMap<String, Boolean>();
		perMap.put("���¹���", Pertran.pertran(rs2.getInt("P0")));
		perMap.put("���۹���", Pertran.pertran(rs2.getInt("P1")));
		perMap.put("�˻�����", Pertran.pertran(rs2.getInt("P2")));
		perMap.put("�ɹ�����", Pertran.pertran(rs2.getInt("P3")));
		perMap.put("������", Pertran.pertran(rs2.getInt("P4")));
		perMap.put("�˱�����", Pertran.pertran(rs2.getInt("P5")));
		perMap.put("��Ӧ�̹���", Pertran.pertran(rs2.getInt("P6")));
		perMap.put("�û�����", Pertran.pertran(rs2.getInt("P7")));
		perMap.put("Ȩ�޹���", Pertran.pertran(rs2.getInt("P8")));
		rs2.close();
		stmt2.close();
		return perMap;
	}

	public int queryBySSID(String sessionID) throws SQLException {
		// TODO �Զ����ɵķ������
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
			System.out.println("��ѯʧ��");
			stmt.close();
			return 0;
		}

		return userid;
	}

}
