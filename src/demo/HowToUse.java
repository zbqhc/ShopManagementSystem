package demo;

import java.util.HashMap;
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
		DepartmentInfoDAO departmentInfoDAO = DAOFactory.getDAO("部门信息");// 从dao工厂获取dao的实现对象
		UserInfoDAO userInfoDAO = DAOFactory.getDAO("登录信息");// 从dao工厂获取dao的实现对象
		
		userInfoDAO.addUser(new UserInfo(1, "管理员", "1", 1));
		userInfoDAO.addUser(new UserInfo(15201, "张JAVA", "1", 1));
		userInfoDAO.addUser(new UserInfo(15202, "李PHP", "1", 1001));
		userInfoDAO.addUser(new UserInfo(15203, "王PYTHON", "1", 1002));
		userInfoDAO.addUser(new UserInfo(15204, "刘C++", "1", 1003));
		userInfoDAO.addUser(new UserInfo(15205, "周GOLANG", "1", 1004));
		userInfoDAO.addUser(new UserInfo(15206, "库存资源总管", "1", 2001));
		userInfoDAO.addUser(new UserInfo(15207, "财务主管", "1", 2002));
		userInfoDAO.addUser(new UserInfo(15208, "人力资源总监", "1", 2003));
//		userInfoDAO.addUser(new UserInfo(1, "管理员", "1", 1));
//		userInfoDAO.addUser(new UserInfo(1, "管理员", "1", 1));
//		System.out.println("howtodoit :"+a);
//		Map<String, Boolean> map = new HashMap<String, Boolean>();
//		map.put("人事管理", false);
//		map.put("销售管理", false);
//		map.put("退货管理", false);
//		map.put("采购管理", false);
//		map.put("库存管理", false);
//		map.put("账本管理", true);
//		map.put("供应商管理", false);
//		map.put("用户管理", false);
//		map.put("权限管理", false);
////		boolean res = departmentInfoDAO.addDepartment(new DepartmentInfo(1, "管理员", map));
//		boolean res = departmentInfoDAO.addDepartment(new DepartmentInfo(10006, "会计", map));
//		
//		System.out.println("部门结果:"+res);
		
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
