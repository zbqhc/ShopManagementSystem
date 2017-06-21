package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tools.EncoderHash;

public class UserInfoDAOImpl implements UserInfoDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();

	public int addUser(UserInfo userInfo) throws Exception {
		// TODO �Զ����ɵķ������
		Date now = new Date(); //��ȡ��ǰʱ��
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String timeStamp=dateFormat.format(now);
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO UserInfo (ID,ACCOUNT,KEYWORD,HEADSHIP,TIMESTAMP) "
				+ "VALUES ("
				+ userInfo.getId()
				+ ",'"
				+ userInfo.getAccount()
				+ "','"
				+ EncoderHash.encode("SHA1",  userInfo.getId() + "lntu" + userInfo.getKeyWord())
				+ "', " + userInfo.getHeadship() + ",'" + timeStamp + "');";
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
		return res;
	}

	public int updateUser(int userid, String keyword, int headship)
			throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		UserInfo userInfo = queryById(userid);
		System.out.println(userInfo.getId());
		Date now = new Date(); //��ȡ��ǰʱ��
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		if (headship != -1) {
			userInfo.setHeadship(headship);
			System.out.println("����ְ��");
		}
		System.out.println(userInfo.getId());
		if (keyword != null) {
			userInfo.setKeyWord(EncoderHash.encode("SHA1", userid + "lntu"+ keyword));
			System.out.println("��������");
		}
		String sql = "UPDATE UserInfo SET KEYWORD= '"
				+ userInfo.getKeyWord() + "',HEADSHIP=" + userInfo.getHeadship()+",TIMESTAMP='"+dateFormat.format(now)
				+ "' WHERE ID=" + userid;
		System.out.println(sql);
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
		return res;

	}

	public int delUser(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM UserInfo WHERE ID = "+userid;
		int res=0;
		try {
			if (stmt.executeUpdate(sql)==0){
				System.out.println("�Ҳ���Ŀ���¼");
				res=-2;
			}else {
				System.out.println("ɾ���ɹ�");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ��ʧ��");
			res=-1;
		}
		stmt.close();
		return res;
	}

	public UserInfo queryById(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		UserInfo userInfo = new UserInfo();
		ResultSet rs =null;
		try {
			rs = stmt.executeQuery("SELECT * FROM UserInfo WHERE id="+userid);
			
			userInfo.setId(rs.getInt("ID"));
			userInfo.setAccount(rs.getString("ACCOUNT"));
			userInfo.setHeadship(rs.getInt("HEADSHIP"));
			userInfo.setKeyWord(rs.getString("KEYWORD"));
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯʧ��");
			rs.close();
			return null;
		}

		return userInfo;
	}

	public List<UserInfo> queryAll(int LimitFloor,int LimitUpper) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;
		
		List<UserInfo> listUserInfo = new ArrayList<UserInfo>();
		sql = "SELECT * FROM UserInfo LIMIT +"+LimitFloor+","+LimitUpper;

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			UserInfo userInfo = new UserInfo();
			userInfo.setId(rs.getInt("ID"));
			userInfo.setAccount(rs.getString("ACCOUNT"));
			userInfo.setHeadship(rs.getInt("HEADSHIP"));
			userInfo.setKeyWord(rs.getString("KEYWORD"));
			listUserInfo.add(userInfo);
		}
		rs.close();
		return listUserInfo;
	}
	public List<UserInfo> queryAll() throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;
		
		List<UserInfo> listUserInfo = new ArrayList<UserInfo>();
		sql = "SELECT * FROM UserInfo";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			UserInfo userInfo = new UserInfo();
			userInfo.setId(rs.getInt("ID"));
			userInfo.setAccount(rs.getString("ACCOUNT"));
			userInfo.setHeadship(rs.getInt("HEADSHIP"));
			userInfo.setKeyWord(rs.getString("KEYWORD"));
			listUserInfo.add(userInfo);
		}
		rs.close();
		return listUserInfo;
	}

	public int checkUser(int userid, String keyword) throws Exception {
		// TODO �Զ����ɵķ������
		UserInfo userInfo = queryById(userid);
		if (userInfo==null){
			System.out.println("account not exist");
			return -1;
		}else if (EncoderHash.encode("SHA1", userid + "lntu" + keyword).equals(userInfo.getKeyWord())) {
			System.out.println("ͨ��");
			return 0;
		}else {
			System.out.println("�������");
			return -2;
		}
		
	}

}
