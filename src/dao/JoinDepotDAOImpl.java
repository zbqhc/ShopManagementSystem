package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JoinDepotDAOImpl implements JoinDepotDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();

	public int addItem(JoinDepot joinDepot) throws Exception {
		// TODO �Զ����ɵķ������

		int id = joinDepot.getId();// ����
		String oid = joinDepot.getOid();// �������
		int dId = joinDepot.getdId();// �ֿ���
		String wareName = joinDepot.getWareName();// ��Ʒ����
		String joinTime = joinDepot.getJoinTime();// ���ʱ��
		float weight = joinDepot.getWeight();// ��Ʒ����
		int quantity = joinDepot.getQuantity();// ��Ʒ����
		String remark = joinDepot.getRemark();// ��ע��Ϣ
		int res = 0;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO JoinDepot (ID,OID,DID,WARENAME,JOINTIME,WEIGHT,QUANTITY,REMARK) "
				+ "VALUES ("
				+ id
				+ ",'"
				+ oid
				+ "',"
				+ dId
				+ ", '"
				+ wareName
				+ "','"
				+ joinTime
				+ "',"
				+ weight
				+ ","
				+ quantity
				+ ",'"
				+ remark + "');";
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

	public int updateItem(JoinDepot joinDepot) throws Exception {

		// TODO �Զ����ɵķ������
		int id = joinDepot.getId();// ����
		String oid = joinDepot.getOid();// �������
		int dId = joinDepot.getdId();// �ֿ���
		String wareName = joinDepot.getWareName();// ��Ʒ����
		String joinTime = joinDepot.getJoinTime();// ���ʱ��
		float weight = joinDepot.getWeight();// ��Ʒ����
		int quantity = joinDepot.getQuantity();// ��Ʒ����
		String remark = joinDepot.getRemark();// ��ע��Ϣ
		int res = 0;
		Statement stmt = conn.createStatement();
		String sql = "UPDATE JoinDepot SET OID='" + oid + "' ,DID=" + dId
				+ " ,WARENAME='" + wareName + "' ,JOINTIME='" + joinTime
				+ "' ,WEIGHT= " + weight + ",QUANTITY=" + quantity
				+ ",REMARK='" + remark + "' WHERE ID =" + id;
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

	public int delItem(int itemid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM JoinDepot WHERE ID = " + itemid;
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

	public JoinDepot queryById(int itemid) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		JoinDepot joinDepot = new JoinDepot();
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM JoinDepot");
			joinDepot.setId(rs.getInt("ID"));
			joinDepot.setdId(rs.getInt("DID"));
			joinDepot.setJoinTime(rs.getString("JOINTIME"));
			joinDepot.setOid(rs.getString("OID"));
			joinDepot.setQuantity(rs.getInt("QUANTITY"));
			joinDepot.setRemark(rs.getString("REMARK"));
			joinDepot.setWareName(rs.getString("WARENAME"));
			joinDepot.setWeight(rs.getFloat("WEIGHT"));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯʧ��");
		}

		return joinDepot;
	}

	public List queryAll() throws Exception {
		Statement stmt = conn.createStatement();
		String sql;

		List<JoinDepot> listJoinDepot = new ArrayList<JoinDepot>();
		sql = "SELECT * FROM JoinDepot";
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			JoinDepot joinDepot = new JoinDepot();
			joinDepot.setId(rs.getInt("ID"));
			joinDepot.setdId(rs.getInt("DID"));
			joinDepot.setJoinTime(rs.getString("JOINTIME"));
			joinDepot.setOid(rs.getString("OID"));
			joinDepot.setQuantity(rs.getInt("QUANTITY"));
			joinDepot.setRemark(rs.getString("REMARK"));
			joinDepot.setWareName(rs.getString("WARENAME"));
			joinDepot.setWeight(rs.getFloat("WEIGHT"));
			listJoinDepot.add(joinDepot);
		}
		rs.close();
		return listJoinDepot;

	}

	public List queryAll(int limitFloor, int limitUpper) throws Exception {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql;

		List<JoinDepot> listJoinDepot = new ArrayList<JoinDepot>();
		sql = "SELECT * FROM JoinDepot LIMIT +" + limitFloor + "," + limitUpper;

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			JoinDepot joinDepot = new JoinDepot();
			joinDepot.setId(rs.getInt("ID"));
			joinDepot.setdId(rs.getInt("DID"));
			joinDepot.setJoinTime(rs.getString("JOINTIME"));
			joinDepot.setOid(rs.getString("OID"));
			joinDepot.setQuantity(rs.getInt("QUANTITY"));
			joinDepot.setRemark(rs.getString("REMARK"));
			joinDepot.setWareName(rs.getString("WARENAME"));
			joinDepot.setWeight(rs.getFloat("WEIGHT"));
			listJoinDepot.add(joinDepot);
		}
		rs.close();
		return listJoinDepot;
	}

}
