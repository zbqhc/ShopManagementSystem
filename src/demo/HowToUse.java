package demo;

import java.util.List;

import tools.Timenow;
import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		ProvideInfoDAO provideInfoDAO = DAOFactory.getDAO("��Ӧ����Ϣ");// ��dao������ȡdao��ʵ�ֶ���

		 provideInfoDAO.addUser(new ProvideInfo(1520010923, "A-58", "��02", "��", "15541234", "10003", "12505", "6704002365699", "http://zbqhc.net/", "i@zbqhc.net", "��"));
		 
		
		 for (ProvideInfo i:(List<ProvideInfo>)provideInfoDAO.queryAll(1,1)){
			 System.out.println(i.getId());
			 
		 }
	}
}
