package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tools.Timenow;

public class PaymentInfoDAOImpl implements PaymentInfoDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();
	
	public List<PaymentInfo> QueryAll() throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;
		
		List<PaymentInfo> paymentInfos = new ArrayList<PaymentInfo>();
		sql = "SELECT * FROM PaymentInfo";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			PaymentInfo paymentInfo = new PaymentInfo();
			paymentInfo.setId(rs.getInt("ID"));
			paymentInfo.setSid(rs.getInt("SID"));
			paymentInfo.setSname(rs.getString("SNAME"));
			paymentInfo.setsQuantity(rs.getInt("SQUANTITY"));
			paymentInfo.setTrice(rs.getFloat("TRICE"));
			paymentInfo.setRemarks(rs.getString("REMARKS"));
			paymentInfo.setTimeStamp(rs.getString("TIMESTAMP"));
			paymentInfos.add(paymentInfo);
		}
		rs.close();
		return paymentInfos;
	}

	public List<PaymentInfo> QueryByDate(String date) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;
		
		List<PaymentInfo> paymentInfos = new ArrayList<PaymentInfo>();
		sql = "SELECT * FROM PaymentInfo WHERE TIMESTAMP LIKE '"+date+"%'";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			PaymentInfo paymentInfo = new PaymentInfo();
			paymentInfo.setId(rs.getInt("ID"));
			paymentInfo.setSid(rs.getInt("SID"));
			paymentInfo.setSname(rs.getString("SNAME"));
			paymentInfo.setsQuantity(rs.getInt("SQUANTITY"));
			paymentInfo.setTimeStamp(rs.getString("TIMESTAMP"));
			paymentInfo.setTrice(rs.getFloat("TRICE"));
			paymentInfo.setRemarks(rs.getString("REMARKS"));
			paymentInfos.add(paymentInfo);
		}
		rs.close();
		return paymentInfos;
	}

	public boolean addRecord(PaymentInfo paymentInfo) throws SQLException {
		// TODO 自动生成的方法存根
		int id=paymentInfo.getId();// 主键
		int sid=paymentInfo.getSid();// 商品编号
		String sname=paymentInfo.getSname();// 商品名称
		int sQuantity=paymentInfo.getsQuantity();// 商品数量
		float trice=paymentInfo.getTrice();// 商品单价;记正为卖出 负为退货
		String TimeStamp=Timenow.getTimeNow();// 时间
		String remarks=paymentInfo.getRemarks(); // 备注信息
		boolean res=true;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO PaymentInfo (ID,SID,SNAME,SQUANTITY,TRICE,TIMESTAMP,REMARKS) "
				+ "VALUES (" + id + "," + sid + ",'" + sname + "', " + sQuantity
				+ "," + trice + ",'" + TimeStamp + "','"+remarks+"');";
		System.out.println(sql);
		try {
			stmt.executeUpdate(sql);
			System.out.println("插入成功");
		} catch (SQLException e) {
			if (e.getErrorCode()==19){
				System.out.println("主键重复");
				res=false;
				e.printStackTrace();
			}
			System.out.println("插入失败");
			e.printStackTrace();
			res=false;
		}
		stmt.close();
		return res;
	}

	public boolean delRecord(int id) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM PaymentInfo WHERE ID = "+id;
		boolean res=true;
		try {
			stmt.executeUpdate(sql);
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除失败");
			res=false;
		}
		stmt.close();
		return res;
	}

	public float calcProfit() throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT SUM(TRICE + SQUANTITY) FROM PaymentInfo;");
		System.out.println(rs.getFloat("SUM(TRICE + SQUANTITY)"));
		return 0;
	}

	public float calcProfitByDate(String date) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT SUM(TRICE + SQUANTITY) FROM PaymentInfo WHERE TIMESTAMP LIKE '"+date+"%'");
		System.out.println(date);
		System.out.println(rs.getFloat("SUM(TRICE + SQUANTITY)"));
		return 0;
	}

	public List<PaymentInfo> QueryByType(String type) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;
		
		List<PaymentInfo> paymentInfos = new ArrayList<PaymentInfo>();
		sql = "SELECT * FROM PaymentInfo WHERE REMARKS LIKE '"+type+"%'";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			PaymentInfo paymentInfo = new PaymentInfo();
			paymentInfo.setId(rs.getInt("ID"));
			paymentInfo.setSid(rs.getInt("SID"));
			paymentInfo.setSname(rs.getString("SNAME"));
			paymentInfo.setsQuantity(rs.getInt("SQUANTITY"));
			paymentInfo.setTimeStamp(rs.getString("TIMESTAMP"));
			paymentInfo.setTrice(rs.getFloat("TRICE"));
			paymentInfo.setRemarks(rs.getString("REMARKS"));
			paymentInfos.add(paymentInfo);
		}
		rs.close();
		return paymentInfos;
	}

	public List<PaymentInfo> QueryBySID(int sid) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;
		
		List<PaymentInfo> paymentInfos = new ArrayList<PaymentInfo>();
		sql = "SELECT * FROM PaymentInfo WHERE SID LIKE "+sid+"%";

		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			PaymentInfo paymentInfo = new PaymentInfo();
			paymentInfo.setId(rs.getInt("ID"));
			paymentInfo.setSid(rs.getInt("SID"));
			paymentInfo.setSname(rs.getString("SNAME"));
			paymentInfo.setsQuantity(rs.getInt("SQUANTITY"));
			paymentInfo.setTimeStamp(rs.getString("TIMESTAMP"));
			paymentInfo.setTrice(rs.getFloat("TRICE"));
			paymentInfo.setRemarks(rs.getString("REMARKS"));
			paymentInfos.add(paymentInfo);
		}
		rs.close();
		return paymentInfos;
	}

	public float calcProfitBySID(int sid) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT SUM(TRICE + SQUANTITY) FROM PaymentInfo WHERE SID LIKE "+sid+"%");
		System.out.println(sid);
		System.out.println(rs.getFloat("SUM(TRICE + SQUANTITY)"));
		return 0;
	}

	public float calcProfitByType(String type) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT SUM(TRICE + SQUANTITY) FROM PaymentInfo WHERE REMARKS LIKE '"+type+"%'");
		System.out.println(type);
		System.out.println(rs.getFloat("SUM(TRICE + SQUANTITY)"));
		return 0;
	}

}
