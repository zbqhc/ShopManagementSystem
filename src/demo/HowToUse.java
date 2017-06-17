package demo;

import java.util.List;

import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		UserInfoDAO userInfoDAO = DAOFactory.getDAO("登录信息");//从dao工厂获取dao的实现对象
		
		userInfoDAO.addUser(new UserInfo(150109339,"软件15-9", "lntu", 15));// 添加用户 id 用户名 密码 职务
		userInfoDAO.delUser(1520010924);						//删除用户
		userInfoDAO.updateUser(1520010900, "new", 9999);		//更新用户密码职务 密码==null 职务 == -1 为不更新
		for (UserInfo i : (List<UserInfo>) userInfoDAO.queryAll(0,5)) {//获取0~5全部数据，参数为空则获取全部
			System.out.println(i.getAccount());
		}
		userInfoDAO.checkUser(150109339, "lntu");				//检验用户密码返回 true false
	}
}
