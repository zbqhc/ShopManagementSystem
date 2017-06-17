package dao;

import java.util.Map;

public interface SessionDAO extends DAO {

	public Session getSession(int userid);//创建一个新的会话，返回会话对象

	public int destroySessionByUID(int id);//销毁给定的Session id，当前用户当前会话失效

	public int destroySessionByID(int uid);//销毁给定的用户id的全部session，当前用户所有

	public Map<String, Boolean> checkSession(Session session);//检查会话，返回权限map 否则返回null
}
