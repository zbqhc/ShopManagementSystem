package dao;

import java.util.List;

public interface DetailInfoDAO extends DAO {

	public int addUser(DetailInfo detailInfo) throws Exception;

	// �޸Ĳ���
	public int updateUser(DetailInfo detailInfo) throws Exception;

	// ɾ������
	public int delUser(int userid) throws Exception;

	// ��ID��ѯ����
	public DetailInfo queryById(int userid) throws Exception;

	// ��ѯȫ��
	public List<DetailInfo> queryAll() throws Exception;

	public List<DetailInfo> queryAll(int LimitFloor, int LimitUpper)
			throws Exception;
}
