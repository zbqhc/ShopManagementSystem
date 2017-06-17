package dao;

import java.util.Map;

public interface SessionDAO extends DAO {

	public Session addSession(int userid);//����һ���µĻỰ�����ػỰ����

	public int destroySessionByUID(int uid);//���ٸ�����Session id����ǰ�û���ǰ�ỰʧЧ

	public int destroySessionByID(int id);//���ٸ������û�id��ȫ��session����ǰ�û�����

	public Map<String, Boolean> checkSession();
}
