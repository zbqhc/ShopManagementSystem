package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JoinDepotDAOImpl implements JoinDepotDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();
	
	public int addItem(JoinDepot joinDepot) throws Exception {
		// TODO �Զ����ɵķ������

		int id=joinDepot.getdId();//����
		String oid=joinDepot.getOid();//�������
		int dId=joinDepot.getdId();//�ֿ���
		String wareName=joinDepot.getWareName();//��Ʒ����
		String joinTime=joinDepot.getJoinTime();//���ʱ��
		float weight=joinDepot.getWeight();//��Ʒ����
		int quantity=joinDepot.getQuantity();//��Ʒ����
		String remark=joinDepot.getRemark();//��ע��Ϣ
		int res=0;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO JoinDepot (ID,OID,DID,WARENAME,JOINTIME,WEIGHT,QUANTITY,REMARK) "
				+ "VALUES (" + id + ",'" + oid + "'," + dId + ", '" + wareName
				+ "','" + joinTime + "'," + weight +"," + quantity +",'" + remark + "');";
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

	public int updateItem(JoinDepot joinDepot) throws Exception {
		return 0;
		// TODO �Զ����ɵķ������
		
	}

	public int delItem(int itemid) throws Exception {
		return itemid;
		// TODO �Զ����ɵķ������
		
	}

	public JoinDepot queryById(int itemid) throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	public List queryAll() throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	public List queryAll(int limitFloor, int limitUpper) throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	
}
