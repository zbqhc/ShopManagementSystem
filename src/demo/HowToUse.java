package demo;

import java.util.List;

import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		JoinDepotDAO joinDepotDAO = DAOFactory.getDAO("仓库信息");// 从dao工厂获取dao的实现对象

//		 joinDepotDAO.updateItem(new JoinDepot(1520010925, "Ex1003", 10003,
//		 "显示器", Timenow.getTimeNow(), 100, 20, "无"));
		
		 for (JoinDepot i:(List<JoinDepot>)joinDepotDAO.queryAll(0,1)){
			 System.out.println(i.getId());
			 
		 }
//		joinDepotDAO.delItem(100);
	}
}
