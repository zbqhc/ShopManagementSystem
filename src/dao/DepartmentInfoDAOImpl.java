package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tools.Pertran;

public class DepartmentInfoDAOImpl implements DepartmentInfoDAO {
	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();

	public boolean addDepartment(DepartmentInfo departmentInfo)
			throws SQLException {
		// TODO �Զ����ɵķ������
		int id = departmentInfo.getId();
		String name = departmentInfo.getName();
		Map<String, Boolean> permitMap = departmentInfo.getPermitMap();

		boolean res = true;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO DepatrmentInfo (ID,NAME,P0,P1,P2,P3,P4,P5,P6,P7,P8,P9) "
				+ "VALUES ("
				+ id
				+ ",'"
				+ name
				+ "',"
				+ Pertran.pertran(permitMap.get("���¹���"))
				+ ","
				+ Pertran.pertran(permitMap.get("���۹���"))
				+ ","
				+ Pertran.pertran(permitMap.get("�˻�����"))
				+ ","
				+ Pertran.pertran(permitMap.get("�ɹ�����"))
				+ ","
				+ Pertran.pertran(permitMap.get("������"))
				+ ","
				+ Pertran.pertran(permitMap.get("�˱�����"))
				+ ","
				+ Pertran.pertran(permitMap.get("��Ӧ�̹���"))
				+ ","
				+ Pertran.pertran(permitMap.get("�û�����"))
				+ ","
				+ Pertran.pertran(permitMap.get("Ȩ�޹���")) + "," + 0 + ");";
		try {
			stmt.executeUpdate(sql);
			System.out.println("��ӳɹ�");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("�����ظ�");
				res = false;
				e.printStackTrace();
			}
			System.out.println("���ʧ��");
			res = false;
		}
		stmt.close();
		return res;
	}

	public boolean delDepartment(int id) throws SQLException {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM DepatrmentInfo WHERE ID = " + id;
		boolean res = true;
		try {
			stmt.executeUpdate(sql);
			System.out.println("ɾ���ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ��ʧ��");
			res = false;
		}
		stmt.close();
		return res;
	}

	public boolean updateDepartment(DepartmentInfo departmentInfo)
			throws SQLException {
		// TODO �Զ����ɵķ������
		int id = departmentInfo.getId();
		String name = departmentInfo.getName();
		Map<String, Boolean> permitMap = departmentInfo.getPermitMap();

		boolean res = true;
		Statement stmt = conn.createStatement();
		String sql = "UPDATE DepatrmentInfo SET ID=" + id + ",NAME='" + name
				+ "',P0=" + Pertran.pertran(permitMap.get("���¹���")) + ",P1="
				+ Pertran.pertran(permitMap.get("���۹���")) + ",P2="
				+ Pertran.pertran(permitMap.get("�˻�����")) + ",P3="
				+ Pertran.pertran(permitMap.get("�ɹ�����")) + ",P4="
				+ Pertran.pertran(permitMap.get("������")) + ",P5="
				+ Pertran.pertran(permitMap.get("�˱�����")) + ",P6="
				+ Pertran.pertran(permitMap.get("��Ӧ�̹���")) + ",P7="
				+ Pertran.pertran(permitMap.get("�û�����")) + ",P8="
				+ Pertran.pertran(permitMap.get("Ȩ�޹���")) + ",P9=0";
		try {
			stmt.executeUpdate(sql);
			System.out.println("��ӳɹ�");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("�����ظ�");
				res = false;
				e.printStackTrace();
			}
			System.out.println("���ʧ��");
			res = false;
		}
		stmt.close();
		return res;
	}

	public List<DepartmentInfo> queryAll() throws SQLException {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;

		List<DepartmentInfo> departmentInfos = new ArrayList<DepartmentInfo>();
		sql = "SELECT * FROM DepatrmentInfo";
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			DepartmentInfo departmentInfo = new DepartmentInfo();
			departmentInfo.setId(rs.getInt("ID"));
			departmentInfo.setName(rs.getString("NAME"));
			Map<String, Boolean> perMap = new HashMap<String, Boolean>();
			perMap.put("���¹���", Pertran.pertran(rs.getInt("P0")));
			perMap.put("���۹���", Pertran.pertran(rs.getInt("P1")));
			perMap.put("�˻�����", Pertran.pertran(rs.getInt("P2")));
			perMap.put("�ɹ�����", Pertran.pertran(rs.getInt("P3")));
			perMap.put("������", Pertran.pertran(rs.getInt("P4")));
			perMap.put("�˱�����", Pertran.pertran(rs.getInt("P5")));
			perMap.put("��Ӧ�̹���", Pertran.pertran(rs.getInt("P6")));
			perMap.put("�û�����", Pertran.pertran(rs.getInt("P7")));
			perMap.put("Ȩ�޹���", Pertran.pertran(rs.getInt("P8")));
			departmentInfo.setPermitMap(perMap);
			departmentInfos.add(departmentInfo);
		}
		rs.close();
		return departmentInfos;
	}

	public Map<String, Boolean> getPermit(int id) throws SQLException {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;

		sql = "SELECT * FROM DepatrmentInfo WHERE ID=" + id;
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);

		Map<String, Boolean> perMap = new HashMap<String, Boolean>();
		perMap.put("���¹���", Pertran.pertran(rs.getInt("P0")));
		perMap.put("���۹���", Pertran.pertran(rs.getInt("P1")));
		perMap.put("�˻�����", Pertran.pertran(rs.getInt("P2")));
		perMap.put("�ɹ�����", Pertran.pertran(rs.getInt("P3")));
		perMap.put("������", Pertran.pertran(rs.getInt("P4")));
		perMap.put("�˱�����", Pertran.pertran(rs.getInt("P5")));
		perMap.put("��Ӧ�̹���", Pertran.pertran(rs.getInt("P6")));
		perMap.put("�û�����", Pertran.pertran(rs.getInt("P7")));
		perMap.put("Ȩ�޹���", Pertran.pertran(rs.getInt("P8")));
		rs.close();
		return perMap;
	}

	public DepartmentInfo queryByID(int id) throws SQLException {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;
		DepartmentInfo departmentInfo = new DepartmentInfo();
		sql = "SELECT * FROM DepatrmentInfo WHERE ID=" + id;
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		departmentInfo.setId(id);
		departmentInfo.setName(rs.getString("NAME"));
		departmentInfo.setPermitMap(getPermit(id));
		
		return departmentInfo;
	}

}
