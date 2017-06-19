package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicInfoDAOImpl implements BasicInfoDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();
	
	public BasicInfoDAOImpl() {
		System.out.print("���� BasicInfoImpl �����ɹ�\n");
		// TODO �Զ����ɵĹ��캯�����
	}


	public int addUser(BasicInfo basicInfo) throws Exception {
		// TODO �Զ����ɵķ������
		int id = basicInfo.id;// ID
		String name = basicInfo.name;// ����
		int sex = basicInfo.sex;// �Ա�1:�� 0��Ů
		String birth = basicInfo.birth;// ��������
		int dept = basicInfo.dept;// ����
		int headship = basicInfo.headship;// ְ��
		int res=0;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO BasicInfo (ID,NAME,SEX,BIRTH,DEPT,HEADSHIP) "
				+ "VALUES (" + id + ",'" + name + "'," + sex + ", '" + birth
				+ "'," + dept + "," + headship + ");";
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
	
	public int updateUser(BasicInfo basicInfo) throws Exception {
		// TODO �Զ����ɵķ������
		int id = basicInfo.id;// ID
		String name = basicInfo.name;// ����
		int sex = basicInfo.sex;// �Ա�1:�� 0��Ů
		String birth = basicInfo.birth;// ��������
		int dept = basicInfo.dept;// ����
		int headship = basicInfo.headship;// ְ��

		Statement stmt = conn.createStatement();
		String sql = "UPDATE BasicInfo SET NAME='"+name+"' ,SEX="+sex+" ,BIRTH='"+birth+"' ,DEPT="+dept+" ,HEADSHIP= "+headship+" WHERE ID ="+id;
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
		String sql = " DELETE FROM BasicInfo WHERE ID = "+userid;
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

	public BasicInfo queryById(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		BasicInfo basicInfo = new BasicInfo();
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM BasicInfo");
			basicInfo.setId(rs.getInt("ID"));
			basicInfo.setBirth(rs.getString("BIRTH"));
			basicInfo.setDept(rs.getInt("DEPT"));
			basicInfo.setHeadship(rs.getInt("HEADSHIP"));
			basicInfo.setSex(rs.getInt("SEX"));
			basicInfo.setName(rs.getString("NAME"));
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯʧ��");
			return null;
		}
		
		return basicInfo;
	}

	public List<BasicInfo> queryAll(int LimitFloor,int LimitUpper) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;
		
		List<BasicInfo> listBasicInfo = new ArrayList<BasicInfo>();
		sql = "SELECT * FROM BasicInfo LIMIT +"+LimitFloor+","+LimitUpper;

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			BasicInfo basicInfo = new BasicInfo();
			basicInfo.setId(rs.getInt("ID"));
			basicInfo.setBirth(rs.getString("BIRTH"));
			basicInfo.setDept(rs.getInt("DEPT"));
			basicInfo.setHeadship(rs.getInt("HEADSHIP"));
			basicInfo.setSex(rs.getInt("SEX"));
			basicInfo.setName(rs.getString("NAME"));
			listBasicInfo.add(basicInfo);
		}
		rs.close();
		return listBasicInfo;
	}


	public List queryAll() throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;
		
		List<BasicInfo> listBasicInfo = new ArrayList<BasicInfo>();
		sql = "SELECT * FROM BasicInfo";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			BasicInfo basicInfo = new BasicInfo();
			basicInfo.setId(rs.getInt("ID"));
			basicInfo.setBirth(rs.getString("BIRTH"));
			basicInfo.setDept(rs.getInt("DEPT"));
			basicInfo.setHeadship(rs.getInt("HEADSHIP"));
			basicInfo.setSex(rs.getInt("SEX"));
			basicInfo.setName(rs.getString("NAME"));
			listBasicInfo.add(basicInfo);
		}
		rs.close();
		return listBasicInfo;
	}

}
