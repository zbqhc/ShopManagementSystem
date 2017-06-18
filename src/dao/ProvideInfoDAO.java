package dao;

import java.util.List;

public interface ProvideInfoDAO extends DAO {

	public int addUser(ProvideInfo provideInfo) throws Exception;

	// 修改操作
	public int updateUser(ProvideInfo provideInfo) throws Exception;

	// 删除操作
	public int delUser(int userid) throws Exception;

	// 按ID查询操作
	public ProvideInfo queryById(int userid) throws Exception;

	// 查询全部
	public List queryAll() throws Exception;

	public List queryAll(int limitFloor, int limitUpper) throws Exception;
}
