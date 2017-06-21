package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import logic.Commodity;
import logic.Department;
import logic.Login;
import logic.Stock;
import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		UserInfoDAO userInfoDAO = DAOFactory.getDAO("登录信息");// 从dao工厂获取dao的实现对象
		
		userInfoDAO.addUser(new UserInfo(1, "test", "1", 0));
		
//		Commodity ca =new Commodity();
//		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
//		boolean c = ca.addCommodity(1, 2, "dsa", 5, 2, "");
//		userInfoDAO.addUser(new UserInfo(1520010920, "szz", "1", 528));
//		userInfoDAO.checkUser(1520010920, "1");
//        System.out.println(c);
//		Stock s = new Stock();
//		List<JoinDepot> list = s.queryAllStock();
//		List<PaymentInfo> a = ca.queryTypeCommodity("销售");
//		for(PaymentInfo i:a){
//			System.out.println(i.getSname());
//		}
//		System.out.println(ca.clacCommodityDate("2017/06/20"));
//		Login d = new Login();
//		Map<String, Boolean> map = d.Jurisdiction("1520010907");
		
		
		
	}

}
