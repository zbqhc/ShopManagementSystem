package demo;

import java.util.List;

import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		UserInfoDAO userInfoDAO = DAOFactory.getDAO("登录信息");// 从dao工厂获取dao的实现对象

		userInfoDAO.addUser(new UserInfo(1520010920, "szz", "1", 528));

	}

}
