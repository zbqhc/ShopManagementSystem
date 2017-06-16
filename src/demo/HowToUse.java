package demo;

import java.util.List;

import dao.*;

public class HowToUse {

	public void main() throws Exception {
		// TODO 自动生成的方法存根
		BasicInfoDAO basicInfoDAO = DAOFactory.getDAO("基本信息");
		basicInfoDAO.addUser(new BasicInfo(1520010912,"李天聪",1,"1997-04-12",100013,915465));//添加用户
		basicInfoDAO.addUser(new BasicInfo(1520010920,"孙振洲",1,"1997-07-12",100014,915466));//添加用户
		basicInfoDAO.addUser(new BasicInfo(1520010924,"尹志鹏",1,"1999-11-07",100015,915467));//添加用户
		basicInfoDAO.delUser(1520010920);														//删除用户
		basicInfoDAO.updateUser(new BasicInfo(1520010912,"李天一",1,"1997-04-12",100013,915465));//更新用户信息
		List<BasicInfo> newList = basicInfoDAO.queryAll(50, 10);//获取50~60用户信息到list
		for (BasicInfo i:newList){
			System.out.print(i.getId());
			System.out.println(i.getName());
		}
	}
}
