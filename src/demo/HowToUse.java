package demo;

import java.util.List;

import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		UserInfoDAO userInfoDAO = DAOFactory.getDAO("��¼��Ϣ");
//		userInfoDAO.addUser(1520010900,"���15-9","lntu",15);//����û�
//		userInfoDAO.delUser(1520010924);
//		userInfoDAO.updateUser(1520010924, "new", 9999);
		for (UserInfo i:(List<UserInfo>) userInfoDAO.queryAll()){
			System.out.println(i.getAccount());
		}
	}
}
