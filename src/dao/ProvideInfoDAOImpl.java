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
		// TODO �Զ����ɵķ������

		int id = provideInfo.getId();// ����
		String cName = provideInfo.getcName();// ��Ӧ������
		String address = provideInfo.getAddress();// ��Ӧ�̵�ַ
		String linkMan = provideInfo.getLinkMan();// ��ϵ��
		String linkPhone = provideInfo.getLinkPhone();// ��ϵ�绰
		String faxes = provideInfo.getFaxes();// ����
		String postNum = provideInfo.getPostNum();// ��������
		String bankNum = provideInfo.getBankNum();// �����˺�
		String netAddress = provideInfo.getAddress();// ��ҳ
		String emailAddress = provideInfo.getEmailAddress();// ���������ַ
		String remark = provideInfo.getRemark();// ��ע��Ϣ

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
			System.out.println("����ɹ�");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("�����ظ�");
				res -= 1;
				e.printStackTrace();
			}
			System.out.println("����ʧ��");
			res -= 1;
		}
		stmt.close();
		return res;
	}

	public int updateUser(ProvideInfo provideInfo) throws Exception {
		// TODO �Զ����ɵķ������
		int id = provideInfo.getId();// ����
		String cName = provideInfo.getcName();// ��Ӧ������
		String address = provideInfo.getAddress();// ��Ӧ�̵�ַ
		String linkMan = provideInfo.getLinkMan();// ��ϵ��
		String linkPhone = provideInfo.getLinkPhone();// ��ϵ�绰
		String faxes = provideInfo.getFaxes();// ����
		String postNum = provideInfo.getPostNum();// ��������
		String bankNum = provideInfo.getBankNum();// �����˺�
		String netAddress = provideInfo.getAddress();// ��ҳ
		String emailAddress = provideInfo.getEmailAddress();// ���������ַ
		String remark = provideInfo.getRemark();// ��ע��Ϣ

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
			System.out.println("���³ɹ�");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("�����ظ�");
				res -= 1;
				e.printStackTrace();
			}
			System.out.println("����ʧ��");
			res -= 1;
		}
		stmt.close();
		return res;
	}

	public int delUser(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM ProvideInfo WHERE ID = " + userid;
		int res = 0;
		try {
			stmt.executeUpdate(sql);
			System.out.println("ɾ���ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ��ʧ��");
			res = -1;
		}
		stmt.close();
		return res;
	}

	public ProvideInfo queryById(int userid) throws Exception {
		// TODO �Զ����ɵķ������
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
			System.out.println("��ѯʧ��");
		}
		
		return provideInfo;
	}

	public List queryAll() throws Exception {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
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
