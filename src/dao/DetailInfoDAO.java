package dao;

import java.util.List;

public interface DetailInfoDAO extends DAO {

	public int addUser(DetailInfo detailInfo) throws Exception;

	// 修改操作
	public int updateUser(DetailInfo detailInfo) throws Exception;

	// 删除操作
	public int delUser(int userid) throws Exception;

	// 按ID查询操作
	public DetailInfo queryById(int userid) throws Exception;

	// 查询全部
	public List<DetailInfo> queryAll() throws Exception;

	public List<DetailInfo> queryAll(int LimitFloor, int LimitUpper)
			throws Exception;
}
