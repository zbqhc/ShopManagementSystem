package demo;

import java.util.List;

import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		JoinDepotDAO joinDepotDAO = DAOFactory.getDAO("�ֿ���Ϣ");// ��dao������ȡdao��ʵ�ֶ���

//		 joinDepotDAO.updateItem(new JoinDepot(1520010925, "Ex1003", 10003,
//		 "��ʾ��", Timenow.getTimeNow(), 100, 20, "��"));
		
		 for (JoinDepot i:(List<JoinDepot>)joinDepotDAO.queryAll(0,1)){
			 System.out.println(i.getId());
			 
		 }
//		joinDepotDAO.delItem(100);
	}
}
