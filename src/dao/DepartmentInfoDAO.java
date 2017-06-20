package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DepartmentInfoDAO {

	public boolean addDepartment(DepartmentInfo departmentInfo) throws SQLException;
	
	public boolean delDepartment(int id) throws SQLException;
	
	public boolean updateDepartment(DepartmentInfo departmentInfo) throws SQLException;
	
	public List<DepartmentInfo> queryAll() throws SQLException;
	public DepartmentInfo queryByID(int id) throws SQLException;
	
	public Map<String, Boolean> getPermit(int id) throws SQLException;//根据部门编号查询该部门权限
}
