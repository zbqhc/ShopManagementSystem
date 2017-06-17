package dao;

import java.util.Map;

public interface SessionDAO extends DAO {

	public Session getSession(int userid);//����һ���µĻỰ�����ػỰ����

	public int destroySessionByID(String id);//���ٸ�����Session id����ǰ�û���ǰ�ỰʧЧ

	public int destroySessionByUID(int uid);//���ٸ������û�id��ȫ��session����ǰ�û�����

	public Map<String, Boolean> checkSession(Session session);//���Ự������Ȩ��map ���򷵻�null
}
