package dao;

import java.util.List;

public interface ProvideInfoDAO extends DAO {

	public int addUser(ProvideInfo provideInfo) throws Exception;

	// �޸Ĳ���
	public int updateUser(ProvideInfo provideInfo) throws Exception;

	// ɾ������
	public int delUser(int userid) throws Exception;

	// ��ID��ѯ����
	public ProvideInfo queryById(int userid) throws Exception;

	// ��ѯȫ��
	public List queryAll() throws Exception;

	public List queryAll(int limitFloor, int limitUpper) throws Exception;
}
