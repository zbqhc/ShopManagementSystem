package dao;

import java.sql.SQLException;
import java.util.Map;

public interface SessionInfoDAO extends DAO {

	public SessionInfo getSessionInfo(int userid);//����һ���µĻỰ�����ػỰ����

	public int destroySessionInfoByID(String id);//���ٸ�����SessionInfo id����ǰ�û���ǰ�ỰʧЧ

	public int destroySessionInfoByUID(int uid);//���ٸ������û�id��ȫ��sessionInfo����ǰ�û�����

	public Map<String, Boolean> checkSessionInfo(String sessionID) throws SQLException;//
	public int queryBySSID(String sessionID) throws SQLException;//
}
