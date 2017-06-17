package logic;

import dao.DAOFactory;
import dao.UserInfo;
import dao.UserInfoDAO;

public class Login {
//登录
	public  Session contrastLogin(int id,String password) throws Exception{
	
		//调用数据库，取出用户名和密码
		UserInfoDAO userinfodao = DAOFactory.getDAO("登录信息");
		
		
			if(userinfodao.checkUser(id, password)==0){//用户名密码做对比
				return new Session(id,password);
			}else
			{
			return null;
			}
		
			
			
		
	}

	public int Register(int id,String account,String keyword,int headship) throws Exception{//0为成功，1为失败
		UserInfoDAO userinfodao1 = DAOFactory.getDAO("登录信息");
		if(userinfodao1.addUser(new UserInfo(id,account,keyword,headship))==0){
			return 0;
		}else{
			return -1;
		}
		
	}
}
