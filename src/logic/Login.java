package logic;

import java.util.Map;

import dao.DAOFactory;
import dao.DepartmentInfo;
import dao.DepartmentInfoDAO;
import dao.SessionInfo;
import dao.SessionInfoDAO;
import dao.UserInfo;
import dao.UserInfoDAO;

public class Login {
//登录
	public  String contrastLogin(int id,String password) throws Exception{
	
		//调用数据库，取出用户名和密码
		UserInfoDAO userinfodao = DAOFactory.getDAO("登录信息");
		
		
			if(userinfodao.checkUser(id, password)==0){//用户名密码做对比
				SessionInfoDAO sessioninfo = DAOFactory.getDAO("会话信息");
				return sessioninfo.getSessionInfo(id).getId();
				
			}else
			{
			return null;
			}
		
			
			
		
	}
	public Map Jurisdiction(String id){//权限
		DepartmentInfoDAO department = DAOFactory.getDAO("部门信息");
		UserInfoDAO userinfodao = DAOFactory.getDAO("登录信息");
		SessionInfoDAO sessioninfo = DAOFactory.getDAO("会话信息");
		return null;
		
		
	}

	public int Register(int id,String account,String keyword,int headship) throws Exception{
		//注册账号，0为成功，-1为失败
		UserInfoDAO userinfodao1 = DAOFactory.getDAO("登录信息");
		int r  =  userinfodao1.addUser(new UserInfo(id,account,keyword,headship));
		return r;
		
	}
	
	public int Canaellation(int id) throws Exception{
		//注销账号，0为成功，-1为失败
		UserInfoDAO userinfodao2 = DAOFactory.getDAO("登录信息");
		int c =userinfodao2.delUser(id);
		return c;
	}
	public int Destroy(int uid){
		SessionInfoDAO sessioninfo = DAOFactory.getDAO("会话信息");
		int d =sessioninfo.destroySessionInfoByUID(uid);
		return d;
	}
	
//	public int modifyKeyword(int id,String keyword) throws Exception{
//		//修改密码
//		UserInfoDAO userinfodao3 = DAOFactory.getDAO("登录信息");
//		userinfodao3.updateUser(id, null, id);
//		return 0;
//		
//	}
}
