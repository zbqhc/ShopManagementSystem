package dao;

import java.sql.SQLException;
import java.util.Map;

public interface SessionInfoDAO extends DAO {

	public SessionInfo getSessionInfo(int userid);//创建一个新的会话，返回会话对象

	public int destroySessionInfoByID(String id);//销毁给定的SessionInfo id，当前用户当前会话失效

	public int destroySessionInfoByUID(int uid);//销毁给定的用户id的全部sessionInfo，当前用户所有

	public Map<String, Boolean> checkSessionInfo(String sessionID) throws SQLException;//
	public int queryBySSID(String sessionID) throws SQLException;//
}
