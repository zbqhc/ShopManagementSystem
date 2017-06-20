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
		// TODO 自动生成的方法存根
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
				+ Pertran.pertran(permitMap.get("人事管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("销售管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("退货管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("采购管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("库存管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("账本管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("供应商管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("用户管理"))
				+ ","
				+ Pertran.pertran(permitMap.get("权限管理")) + "," + 0 + ");";
		try {
			stmt.executeUpdate(sql);
			System.out.println("添加成功");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("主键重复");
				res = false;
				e.printStackTrace();
			}
			System.out.println("添加失败");
			res = false;
		}
		stmt.close();
		return res;
	}

	public boolean delDepartment(int id) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql = " DELETE FROM DepatrmentInfo WHERE ID = " + id;
		boolean res = true;
		try {
			stmt.executeUpdate(sql);
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除失败");
			res = false;
		}
		stmt.close();
		return res;
	}

	public boolean updateDepartment(DepartmentInfo departmentInfo)
			throws SQLException {
		// TODO 自动生成的方法存根
		int id = departmentInfo.getId();
		String name = departmentInfo.getName();
		Map<String, Boolean> permitMap = departmentInfo.getPermitMap();

		boolean res = true;
		Statement stmt = conn.createStatement();
		String sql = "UPDATE DepatrmentInfo SET ID=" + id + ",NAME='" + name
				+ "',P0=" + Pertran.pertran(permitMap.get("人事管理")) + ",P1="
				+ Pertran.pertran(permitMap.get("销售管理")) + ",P2="
				+ Pertran.pertran(permitMap.get("退货管理")) + ",P3="
				+ Pertran.pertran(permitMap.get("采购管理")) + ",P4="
				+ Pertran.pertran(permitMap.get("库存管理")) + ",P5="
				+ Pertran.pertran(permitMap.get("账本管理")) + ",P6="
				+ Pertran.pertran(permitMap.get("供应商管理")) + ",P7="
				+ Pertran.pertran(permitMap.get("用户管理")) + ",P8="
				+ Pertran.pertran(permitMap.get("权限管理")) + ",P9=0";
		try {
			stmt.executeUpdate(sql);
			System.out.println("添加成功");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19) {
				System.out.println("主键重复");
				res = false;
				e.printStackTrace();
			}
			System.out.println("添加失败");
			res = false;
		}
		stmt.close();
		return res;
	}

	public List<DepartmentInfo> queryAll() throws SQLException {
		// TODO 自动生成的方法存根
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
			perMap.put("人事管理", Pertran.pertran(rs.getInt("P0")));
			perMap.put("销售管理", Pertran.pertran(rs.getInt("P1")));
			perMap.put("退货管理", Pertran.pertran(rs.getInt("P2")));
			perMap.put("采购管理", Pertran.pertran(rs.getInt("P3")));
			perMap.put("库存管理", Pertran.pertran(rs.getInt("P4")));
			perMap.put("账本管理", Pertran.pertran(rs.getInt("P5")));
			perMap.put("供应商管理", Pertran.pertran(rs.getInt("P6")));
			perMap.put("用户管理", Pertran.pertran(rs.getInt("P7")));
			perMap.put("权限管理", Pertran.pertran(rs.getInt("P8")));
			departmentInfo.setPermitMap(perMap);
			departmentInfos.add(departmentInfo);
		}
		rs.close();
		return departmentInfos;
	}

	public Map<String, Boolean> getPermit(int id) throws SQLException {
		// TODO 自动生成的方法存根
		Statement stmt = conn.createStatement();
		String sql;

		sql = "SELECT * FROM DepatrmentInfo WHERE ID=" + id;
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);

		Map<String, Boolean> perMap = new HashMap<String, Boolean>();
		perMap.put("人事管理", Pertran.pertran(rs.getInt("P0")));
		perMap.put("销售管理", Pertran.pertran(rs.getInt("P1")));
		perMap.put("退货管理", Pertran.pertran(rs.getInt("P2")));
		perMap.put("采购管理", Pertran.pertran(rs.getInt("P3")));
		perMap.put("库存管理", Pertran.pertran(rs.getInt("P4")));
		perMap.put("账本管理", Pertran.pertran(rs.getInt("P5")));
		perMap.put("供应商管理", Pertran.pertran(rs.getInt("P6")));
		perMap.put("用户管理", Pertran.pertran(rs.getInt("P7")));
		perMap.put("权限管理", Pertran.pertran(rs.getInt("P8")));
		rs.close();
		return perMap;
	}

	public DepartmentInfo queryByID(int id) throws SQLException {
		// TODO 自动生成的方法存根
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
