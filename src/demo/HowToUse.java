package demo;

import java.util.List;

import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		PaymentInfoDAO paymentInfoDAO = DAOFactory.getDAO("账单信息");// 从dao工厂获取dao的实现对象

		 paymentInfoDAO.addRecord(new PaymentInfo(1520010923, 2323, "显示器", 200, (float) 3000.5,  "无" ));
		 paymentInfoDAO.addRecord(new PaymentInfo(1520010924, 2323, "显示器", 200, (float) 3000.5,  "无" ));
//		 paymentInfoDAO.delRecord(1520010923);
		paymentInfoDAO.calcProfit("2017/06/19");
//		 for (ProvideInfo i:(List<ProvideInfo>)provideInfoDAO.queryAll(1,1)){
//			 System.out.println(i.getId());
//			 
//		 }
	}
}
