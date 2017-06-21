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
		// TODO 自动生成的方法存根
		Date now = new Date(); //获取当前时间
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
		return res;
	}

	public int updateUser(int userid, String keyword, int headship)
			throws Exception {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		UserInfo userInfo = queryById(userid);
		System.out.println(userInfo.getId());
		Date now = new Date(); //获取当前时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		if (headship != -1) {
			userInfo.setHeadship(headship);
			System.out.println("更新职务");
		}
		System.out.println(userInfo.getId());
		if (keyword != null) {
			userInfo.setKeyWord(EncoderHash.encode("SHA1", userid + "lntu"+ keyword));
			System.out.println("更新密码");
		}
		String sql = "UPDATE UserInfo SET KEYWORD= '"
				+ userInfo.getKeyWord() + "',HEADSHIP=" + userInfo.getHeadship()+",TIMESTAMP='"+dateFormat.format(now)
				+ "' WHERE ID=" + userid;
		System.out.println(sql);
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
		return res;

	}

	public int delUser(int userid) throws Exception {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM UserInfo WHERE ID = "+userid;
		int res=0;
		try {
			if (stmt.executeUpdate(sql)==0){
				System.out.println("找不到目标记录");
				res=-2;
			}else {
				System.out.println("删除成功");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除失败");
			res=-1;
		}
		stmt.close();
		return res;
	}

	public UserInfo queryById(int userid) throws Exception {
		// TODO 自动生成的方法存根
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
			System.out.println("查询失败");
			rs.close();
			return null;
		}

		return userInfo;
	}

	public List<UserInfo> queryAll(int LimitFloor,int LimitUpper) throws Exception {
		// TODO 自动生成的方法存根
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
		// TODO 自动生成的方法存根
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
		// TODO 自动生成的方法存根
		UserInfo userInfo = queryById(userid);
		if (userInfo==null){
			System.out.println("account not exist");
			return -1;
		}else if (EncoderHash.encode("SHA1", userid + "lntu" + keyword).equals(userInfo.getKeyWord())) {
			System.out.println("通过");
			return 0;
		}else {
			System.out.println("口令错误");
			return -2;
		}
		
	}

}
