package dao;

import java.util.List;

public interface UserInfoDAO extends DAO {

	public int addUser(UserInfo userInfo)
			throws Exception;

	// 修改操作
	public int updateUser(int userid, String keyword, int headship)
			throws Exception;

	// 删除操作
	public int delUser(int userid) throws Exception;

	// 按ID查询操作
	public UserInfo queryById(int userid) throws Exception;

	// 查询全部
	public List queryAll(int LimitFloor, int LimitUpper) throws Exception;

	public List queryAll() throws Exception;

	public int checkUser(int userid, String keyword) throws Exception;
}
