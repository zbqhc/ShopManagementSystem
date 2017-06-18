package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProvideInfoDAOImpl implements ProvideInfoDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();

	public int addUser(ProvideInfo provideInfo) throws Exception {
		// TODO 自动生成的方法存根

		int id = provideInfo.getId();// 主键
		String cName = provideInfo.getcName();// 供应商姓名
		String address = provideInfo.getAddress();// 供应商地址
		String linkMan = provideInfo.getLinkMan();// 联系人
		String linkPhone = provideInfo.getLinkPhone();// 联系电话
		String faxes = provideInfo.getFaxes();// 传真
		String postNum = provideInfo.getPostNum();// 邮政编码
		String bankNum = provideInfo.getBankNum();// 银行账号
		String netAddress = provideInfo.getAddress();// 主页
		String emailAddress = provideInfo.getEmailAddress();// 电子邮箱地址
		String remark = provideInfo.getRemark();// 备注信息

		int res = 0;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO ProvideInfo (ID,CNAME,ADDRESS,LINKMAN,LINKPHONE,FAXES,POSTNUM,BANKNUM,NETADDRESS,EMAILADDRESS,REMARK) "
				+ "VALUES ('"
				+ id
				+ "','"
				+ cName
				+ "','"
				+ address
				+ "','"
				+ linkMan
				+ "','"
				+ linkPhone
				+ "','"
				+ faxes
				+ "','"
				+ postNum
				+ "','"
				+ bankNum
				+ "','"
				+ netAddress
				+ "','"
				+ emailAddress
				+ "','"
				+ remark + "');";
		System.out.println(sql);
		try {
			stmt.executeUpdate(sql);
			System.out.println("插入成功");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("主键重复");
				res -= 1;
				e.printStackTrace();
			}
			System.out.println("插入失败");
			res -= 1;
		}
		stmt.close();
		return res;
	}

	public int updateUser(ProvideInfo provideInfo) throws Exception {
		// TODO 自动生成的方法存根
		int id = provideInfo.getId();// 主键
		String cName = provideInfo.getcName();// 供应商姓名
		String address = provideInfo.getAddress();// 供应商地址
		String linkMan = provideInfo.getLinkMan();// 联系人
		String linkPhone = provideInfo.getLinkPhone();// 联系电话
		String faxes = provideInfo.getFaxes();// 传真
		String postNum = provideInfo.getPostNum();// 邮政编码
		String bankNum = provideInfo.getBankNum();// 银行账号
		String netAddress = provideInfo.getAddress();// 主页
		String emailAddress = provideInfo.getEmailAddress();// 电子邮箱地址
		String remark = provideInfo.getRemark();// 备注信息

		int res = 0;
		Statement stmt = conn.createStatement();
		String sql = "UPDATE ProvideInfo SET CNAME='" + cName + "',ADDRESS='"
				+ address + "',LINKMAN='" + linkMan + "',LINKPHONE='"
				+ linkPhone + "',FAXES='" + faxes + "',POSTNUM='" + postNum
				+ "',BANKNUM='" + bankNum + "',NETADDRESS='" + netAddress
				+ "',EMAILADDRESS='" + emailAddress + "',REMARK='" + remark
				 + "' WHERE ID=" + id ;
		System.out.println(sql);
		try {
			stmt.executeUpdate(sql);
			System.out.println("更新成功");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("主键重复");
				res -= 1;
				e.printStackTrace();
			}
			System.out.println("更新失败");
			res -= 1;
		}
		stmt.close();
		return res;
	}

	public int delUser(int userid) throws Exception {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM ProvideInfo WHERE ID = " + userid;
		int res = 0;
		try {
			stmt.executeUpdate(sql);
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除失败");
			res = -1;
		}
		stmt.close();
		return res;
	}

	public ProvideInfo queryById(int userid) throws Exception {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		ProvideInfo provideInfo = new ProvideInfo();
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM ProvideInfo");
			provideInfo.setId(rs.getInt("ID"));
			provideInfo.setAddress(rs.getString("ADDRESS"));
			provideInfo.setBankNum(rs.getString("BANKNUM"));
			provideInfo.setcName(rs.getString("CNAME"));
			provideInfo.setEmailAddress(rs.getString("EMAILADDRESS"));
			provideInfo.setFaxes(rs.getString("FAXES"));
			provideInfo.setLinkMan(rs.getString("LINKMAN"));
			provideInfo.setLinkPhone(rs.getString("LINKPHONE"));
			provideInfo.setNetAddress(rs.getString("NETADDRESS"));
			provideInfo.setPostNum(rs.getString("POSTNUM"));
			provideInfo.setRemark(rs.getString("REMARK"));
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("查询失败");
		}
		
		return provideInfo;
	}

	public List queryAll() throws Exception {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;
		
		List<ProvideInfo> listProvideInfo = new ArrayList<ProvideInfo>();
		sql = "SELECT * FROM ProvideInfo";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			ProvideInfo provideInfo = new ProvideInfo();
			provideInfo.setId(rs.getInt("ID"));
			provideInfo.setAddress(rs.getString("ADDRESS"));
			provideInfo.setBankNum(rs.getString("BANKNUM"));
			provideInfo.setcName(rs.getString("CNAME"));
			provideInfo.setEmailAddress(rs.getString("EMAILADDRESS"));
			provideInfo.setFaxes(rs.getString("FAXES"));
			provideInfo.setLinkMan(rs.getString("LINKMAN"));
			provideInfo.setLinkPhone(rs.getString("LINKPHONE"));
			provideInfo.setNetAddress(rs.getString("NETADDRESS"));
			provideInfo.setPostNum(rs.getString("POSTNUM"));
			provideInfo.setRemark(rs.getString("REMARK"));
			listProvideInfo.add(provideInfo);
		}
		rs.close();
		return listProvideInfo;
	}

	public List queryAll(int limitFloor, int limitUpper) throws Exception {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;
		
		List<ProvideInfo> listProvideInfo = new ArrayList<ProvideInfo>();
		sql = "SELECT * FROM ProvideInfo LIMIT +"+limitFloor+","+limitUpper;

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			ProvideInfo provideInfo = new ProvideInfo();
			provideInfo.setId(rs.getInt("ID"));
			provideInfo.setAddress(rs.getString("ADDRESS"));
			provideInfo.setBankNum(rs.getString("BANKNUM"));
			provideInfo.setcName(rs.getString("CNAME"));
			provideInfo.setEmailAddress(rs.getString("EMAILADDRESS"));
			provideInfo.setFaxes(rs.getString("FAXES"));
			provideInfo.setLinkMan(rs.getString("LINKMAN"));
			provideInfo.setLinkPhone(rs.getString("LINKPHONE"));
			provideInfo.setNetAddress(rs.getString("NETADDRESS"));
			provideInfo.setPostNum(rs.getString("POSTNUM"));
			provideInfo.setRemark(rs.getString("REMARK"));
			listProvideInfo.add(provideInfo);
		}
		rs.close();
		return listProvideInfo;
	}

}
