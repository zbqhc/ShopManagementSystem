package logic;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import dao.DAOFactory;
import dao.DepartmentInfo;
import dao.DepartmentInfoDAO;

public class Department {
//部门
	public List queryAllDepartment() throws SQLException{//查询部门表，返回部门表
		DepartmentInfoDAO depa = DAOFactory.getDAO("部门信息");
		List<DepartmentInfo> list = depa.queryAll();
		return list;
		
	}
	public boolean addDepartment(int id,String name,Map<String,Boolean> permitMap) throws SQLException{//添加部门表，成功返回true,失败返回false
		DepartmentInfoDAO depa = DAOFactory.getDAO("部门信息");
		boolean ad = depa.addDepartment(new DepartmentInfo(id,name,permitMap));
		
		return ad;
		
	}
	public boolean deleteDepartment(int id)throws SQLException{//删除部门，成功返回true,失败返回false
		DepartmentInfoDAO depa = DAOFactory.getDAO("部门信息");
		boolean dd = depa.delDepartment(id);
		return dd;
		
	}
	
	public boolean modifyDepartmentName(int id,String name) throws SQLException{//修改某个部门的某个信息，有多少个属性要多少个方法
		DepartmentInfoDAO depa = DAOFactory.getDAO("部门信息");
		DepartmentInfo d=depa.queryByID(id);
		boolean mdn = depa.updateDepartment(new DepartmentInfo(id,name,d.getPermitMap()));
		return mdn;
		
	}
	public boolean modifyDepartmentMap(int id,Map map) throws SQLException{//修改某个部门的某个信息，有多少个属性要多少个方法
		DepartmentInfoDAO depa = DAOFactory.getDAO("部门信息");
		DepartmentInfo d=depa.queryByID(id);
		boolean mdm = depa.updateDepartment(new DepartmentInfo(id,d.getName(),map));
		return mdm;
		
	}
}
