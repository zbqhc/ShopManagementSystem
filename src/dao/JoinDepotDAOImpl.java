package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JoinDepotDAOImpl implements JoinDepotDAO {

	DatabaseConnection db = new DatabaseConnection();
	Connection conn = db.getConn();
	
	public int addItem(JoinDepot joinDepot) throws Exception {
		// TODO 自动生成的方法存根

		int id=joinDepot.getdId();//主键
		String oid=joinDepot.getOid();//订货编号
		int dId=joinDepot.getdId();//仓库编号
		String wareName=joinDepot.getWareName();//货品名称
		String joinTime=joinDepot.getJoinTime();//入库时间
		float weight=joinDepot.getWeight();//货品重量
		int quantity=joinDepot.getQuantity();//货品数量
		String remark=joinDepot.getRemark();//备注信息
		int res=0;
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO JoinDepot (ID,OID,DID,WARENAME,JOINTIME,WEIGHT,QUANTITY,REMARK) "
				+ "VALUES (" + id + ",'" + oid + "'," + dId + ", '" + wareName
				+ "','" + joinTime + "'," + weight +"," + quantity +",'" + remark + "');";
		try {
			stmt.executeUpdate(sql);
			System.out.println("插入成功");
		} catch (SQLException e) {
			if (e.getErrorCode()==19){
				System.out.println("主键重复");
				res-=1;
				e.printStackTrace();
			}
			System.out.println("插入失败");
			res-=1;
		}
		stmt.close();
		return res;
		
	}

	public int updateItem(JoinDepot joinDepot) throws Exception {
		return 0;
		// TODO 自动生成的方法存根
		
	}

	public int delItem(int itemid) throws Exception {
		return itemid;
		// TODO 自动生成的方法存根
		
	}

	public JoinDepot queryById(int itemid) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	public List queryAll() throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	public List queryAll(int limitFloor, int limitUpper) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	
}
