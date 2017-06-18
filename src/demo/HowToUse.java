package demo;

import java.util.List;

import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		JoinDepotDAO joinDepotDAO = DAOFactory.getDAO("仓库信息");//从dao工厂获取dao的实现对象
		
//		sessiondao.getSession(1520010925);
//		for(int i=0;i<20;i++){
//		detailInfoDAO.addUser(new DetailInfo(15200+i+100,"111"+i,i+"6666","11331","114741","155511"));
//		}
		
//		System.out.println(detailInfoDAO.queryById(15200).getEmail());
	}
}
