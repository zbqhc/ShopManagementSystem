package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DetailInfoDAOImpl implements DetailInfoDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();
	
	public DetailInfoDAOImpl() {
		System.out.print("���� DetailInfoImpl �����ɹ�\n");
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public int addUser(DetailInfo detailInfo) throws Exception {
		// TODO �Զ����ɵķ������
		int id = detailInfo.getId();// ID
		String contact = detailInfo.getContact();// ��ϵ�绰
		String email = detailInfo.getEmail();// ���������ַ
		String faddress = detailInfo.getFaddress();// ��ͥ��ַ
		String fax = detailInfo.getFax();// ����
		String officephone = detailInfo.getOfficePhone();// �칫�绰
		int res=0;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO DetailInfo (ID,CONTACT,EMAIL,FADDRESS,FAX,OFFICEPHONE) "
				+ "VALUES (" + id + ",'" + contact + "','" + email + "', '" + faddress
				+ "','" + fax + "','" + officephone + "');";
		System.out.println(sql);
		try {
			stmt.executeUpdate(sql);
			System.out.println("����ɹ�");
		} catch (SQLException e) {
			if (e.getErrorCode()==19){
				System.out.println("�����ظ�");
				res-=1;
				e.printStackTrace();
			}
			System.out.println("����ʧ��");
			res-=1;
		}
		stmt.close();
		return res;
	}

	public int updateUser(DetailInfo detailInfo) throws Exception {
		// TODO �Զ����ɵķ������
		int id = detailInfo.getId();// ID
		String contact = detailInfo.getContact();// ��ϵ�绰
		String email = detailInfo.getEmail();// ���������ַ
		String faddress = detailInfo.getFaddress();// ��ͥ��ַ
		String fax = detailInfo.getFax();// ����
		String officephone = detailInfo.getOfficePhone();// �칫�绰

		Statement stmt = conn.createStatement();
		String sql = "UPDATE DetailInfo SET CONTACT='"+contact+"' ,EMAIL='"+email+"' ,FADDRESS='"+faddress+"' ,FAX='"+fax+"' ,OFFICEPHONE= '"+officephone+"' WHERE ID ="+id;
		System.out.println(sql);
		int res=0;
		try {
			stmt.executeUpdate(sql);
			System.out.println("���³ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("����ʧ��");
			res=-1;
		}
		stmt.close();
		return res;
	}

	public int delUser(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM DetailInfo WHERE ID = "+userid;
		int res=0;
		try {
			stmt.executeUpdate(sql);
			System.out.println("ɾ���ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ��ʧ��");
			res=-1;
		}
		stmt.close();
		return res;
	}

	public DetailInfo queryById(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		DetailInfo detailInfo = new DetailInfo();
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM DetailInfo");
			detailInfo.setId(rs.getInt("ID"));
			detailInfo.setContact(rs.getString("CONTACT"));
			detailInfo.setEmail(rs.getString("EMAIL"));
			detailInfo.setFaddress(rs.getString("FADDRESS"));
			detailInfo.setFax(rs.getString("FAX"));
			detailInfo.setOfficePhone(rs.getString("OFFICEPHONE"));
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯʧ��");
		}
		
		return detailInfo;
	}

	public List<DetailInfo> queryAll() throws Exception {
		Statement stmt = conn.createStatement();
		String sql;
		
		List<DetailInfo> listDetailInfo = new ArrayList<DetailInfo>();
		sql = "SELECT * FROM DetailInfo ";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setId(rs.getInt("ID"));
			detailInfo.setContact(rs.getString("CONTACT"));
			detailInfo.setEmail(rs.getString("EMAIL"));
			detailInfo.setFaddress(rs.getString("FADDRESS"));
			detailInfo.setFax(rs.getString("FAX"));
			detailInfo.setOfficePhone(rs.getString("OFFICEPHONE"));
			listDetailInfo.add(detailInfo);
		}
		rs.close();
		return listDetailInfo;
		// TODO �Զ����ɵķ������
		
	}

	public List<DetailInfo> queryAll(int LimitFloor, int LimitUpper)
			throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;
		
		List<DetailInfo> listDetailInfo = new ArrayList<DetailInfo>();
		sql = "SELECT * FROM DetailInfo LIMIT +"+LimitFloor+","+LimitUpper;

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			DetailInfo detailInfo = new DetailInfo();
			detailInfo.setId(rs.getInt("ID"));
			detailInfo.setContact(rs.getString("CONTACT"));
			detailInfo.setEmail(rs.getString("EMAIL"));
			detailInfo.setFaddress(rs.getString("FADDRESS"));
			detailInfo.setFax(rs.getString("FAX"));
			detailInfo.setOfficePhone(rs.getString("OFFICEPHONE"));
			listDetailInfo.add(detailInfo);
		}
		rs.close();
		return listDetailInfo;
	}

	

}
