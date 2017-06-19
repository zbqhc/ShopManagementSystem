package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import tools.Timenow;

public class PaymentInfoDAOImpl implements PaymentInfoDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();
	
	public List<PaymentInfo> QueryAll() {
		// TODO �Զ����ɵķ������
		return null;
	}

	public List<PaymentInfo> QueryByDate(String date) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public boolean addRecord(PaymentInfo paymentInfo) throws SQLException {
		// TODO �Զ����ɵķ������
		int id=paymentInfo.getId();// ����
		int sid=paymentInfo.getSid();// ��Ʒ���
		String sname=paymentInfo.getSname();// ��Ʒ����
		int sQuantity=paymentInfo.getsQuantity();// ��Ʒ����
		float trice=paymentInfo.getTrice();// ��Ʒ����;����Ϊ���� ��Ϊ�˻�
		String TimeStamp=Timenow.getTimeNow();// ʱ��
		String remarks=paymentInfo.getRemarks(); // ��ע��Ϣ
		boolean res=true;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO PaymentInfo (ID,SID,SNAME,SQUANTITY,TRICE,TIMESTAMP,REMARKS) "
				+ "VALUES (" + id + "," + sid + ",'" + sname + "', " + sQuantity
				+ "," + trice + ",'" + TimeStamp + "','"+remarks+"');";
		System.out.println(sql);
		try {
			stmt.executeUpdate(sql);
			System.out.println("����ɹ�");
		} catch (SQLException e) {
			if (e.getErrorCode()==19){
				System.out.println("�����ظ�");
				res=false;
				e.printStackTrace();
			}
			System.out.println("����ʧ��");
			e.printStackTrace();
			res=false;
		}
		stmt.close();
		return res;
	}

	public boolean delRecord(int id) throws SQLException {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM PaymentInfo WHERE ID = "+id;
		boolean res=true;
		try {
			stmt.executeUpdate(sql);
			System.out.println("ɾ���ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ��ʧ��");
			res=false;
		}
		stmt.close();
		return res;
	}

	public float calcProfit() throws SQLException {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT SUM(TRICE + SQUANTITY) FROM PaymentInfo;");
		System.out.println(rs.getFloat("SUM(TRICE + SQUANTITY)"));
		return 0;
	}

	public float calcProfit(String date) throws SQLException {
		// TODO �Զ����ɵķ������
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT SUM(TRICE + SQUANTITY) FROM PaymentInfo WHERE TIMESTAMP LIKE '"+date+"%'");
		System.out.println(date);
		System.out.println(rs.getFloat("SUM(TRICE + SQUANTITY)"));
		return 0;
	}

}
