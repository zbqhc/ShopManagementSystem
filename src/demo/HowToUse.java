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
		DepartmentInfoDAO departmentInfoDAO = DAOFactory.getDAO("������Ϣ");// ��dao������ȡdao��ʵ�ֶ���
		UserInfoDAO userInfoDAO = DAOFactory.getDAO("��¼��Ϣ");// ��dao������ȡdao��ʵ�ֶ���
		
		userInfoDAO.addUser(new UserInfo(1, "����Ա", "1", 1));
		userInfoDAO.addUser(new UserInfo(15201, "��JAVA", "1", 1));
		userInfoDAO.addUser(new UserInfo(15202, "��PHP", "1", 1001));
		userInfoDAO.addUser(new UserInfo(15203, "��PYTHON", "1", 1002));
		userInfoDAO.addUser(new UserInfo(15204, "��C++", "1", 1003));
		userInfoDAO.addUser(new UserInfo(15205, "��GOLANG", "1", 1004));
		userInfoDAO.addUser(new UserInfo(15206, "�����Դ�ܹ�", "1", 2001));
		userInfoDAO.addUser(new UserInfo(15207, "��������", "1", 2002));
		userInfoDAO.addUser(new UserInfo(15208, "������Դ�ܼ�", "1", 2003));
//		userInfoDAO.addUser(new UserInfo(1, "����Ա", "1", 1));
//		userInfoDAO.addUser(new UserInfo(1, "����Ա", "1", 1));
//		System.out.println("howtodoit :"+a);
//		Map<String, Boolean> map = new HashMap<String, Boolean>();
//		map.put("���¹���", false);
//		map.put("���۹���", false);
//		map.put("�˻�����", false);
//		map.put("�ɹ�����", false);
//		map.put("������", false);
//		map.put("�˱�����", true);
//		map.put("��Ӧ�̹���", false);
//		map.put("�û�����", false);
//		map.put("Ȩ�޹���", false);
////		boolean res = departmentInfoDAO.addDepartment(new DepartmentInfo(1, "����Ա", map));
//		boolean res = departmentInfoDAO.addDepartment(new DepartmentInfo(10006, "���", map));
//		
//		System.out.println("���Ž��:"+res);
		
//		Commodity ca =new Commodity();
//		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
//		boolean c = ca.addCommodity(1, 2, "dsa", 5, 2, "");
//		userInfoDAO.addUser(new UserInfo(1520010920, "szz", "1", 528));
//		userInfoDAO.checkUser(1520010920, "1");
//        System.out.println(c);
//		Stock s = new Stock();
//		List<JoinDepot> list = s.queryAllStock();
//		List<PaymentInfo> a = ca.queryTypeCommodity("����");
//		for(PaymentInfo i:a){
//			System.out.println(i.getSname());
//		}
//		System.out.println(ca.clacCommodityDate("2017/06/20"));
//		Login d = new Login();
//		Map<String, Boolean> map = d.Jurisdiction("1520010907");
		
		
		
	}

}
