package demo;

import java.util.List;

import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		ProvideInfoDAO provideInfoDAO = DAOFactory.getDAO("供应商信息");// 从dao工厂获取dao的实现对象

		 provideInfoDAO.addUser(new ProvideInfo(1520010923, "A-58", "耘02", "龙", "15541234", "10003", "12505", "6704002365699", "http://zbqhc.net/", "i@zbqhc.net", "无"));
		 
		
		 for (ProvideInfo i:(List<ProvideInfo>)provideInfoDAO.queryAll(1,1)){
			 System.out.println(i.getId());
			 
		 }
	}
}
