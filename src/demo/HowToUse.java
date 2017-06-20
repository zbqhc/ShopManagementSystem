package demo;

import java.util.List;

import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		PaymentInfoDAO paymentInfoDAO = DAOFactory.getDAO("�˵���Ϣ");// ��dao������ȡdao��ʵ�ֶ���

		 paymentInfoDAO.addRecord(new PaymentInfo(1520010923, 2323, "��ʾ��", 200, (float) 3000.5,  "��" ));
		 paymentInfoDAO.addRecord(new PaymentInfo(1520010924, 2323, "��ʾ��", 200, (float) 3000.5,  "��" ));
		 paymentInfoDAO.addRecord(new PaymentInfo(1520010927, 2323, "��ʾ��", 200, (float) 300.5,  "��" ));
		 paymentInfoDAO.addRecord(new PaymentInfo(1520010928, 2323, "��ʾ��", 200, (float) 300.5,  "��" ));
//		 paymentInfoDAO.delRecord(1520010923);
		paymentInfoDAO.calcProfit("2017/06/19");
		 for (PaymentInfo i:(List<PaymentInfo>) paymentInfoDAO.QueryByDate("2017/06/19")){
			 System.out.print(i.getId());
			 System.out.println(i.getTimeStamp());
			 
		 }
	}
}
