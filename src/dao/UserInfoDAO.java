package dao;

import java.util.List;

public interface UserInfoDAO extends DAO {

	public int addUser(UserInfo userInfo)
			throws Exception;

	// �޸Ĳ���
	public int updateUser(int userid, String keyword, int headship)
			throws Exception;

	// ɾ������
	public int delUser(int userid) throws Exception;

	// ��ID��ѯ����
	public UserInfo queryById(int userid) throws Exception;

	// ��ѯȫ��
	public List queryAll(int LimitFloor, int LimitUpper) throws Exception;

	public List queryAll() throws Exception;

	public int checkUser(int userid, String keyword) throws Exception;
}
