package demo;

import java.util.List;

import dao.*;

public class HowToUse {

	public void main() throws Exception {
		// TODO �Զ����ɵķ������
		BasicInfoDAO basicInfoDAO = DAOFactory.getDAO("������Ϣ");
		basicInfoDAO.addUser(new BasicInfo(1520010912,"�����",1,"1997-04-12",100013,915465));//����û�
		basicInfoDAO.addUser(new BasicInfo(1520010920,"������",1,"1997-07-12",100014,915466));//����û�
		basicInfoDAO.addUser(new BasicInfo(1520010924,"��־��",1,"1999-11-07",100015,915467));//����û�
		basicInfoDAO.delUser(1520010920);														//ɾ���û�
		basicInfoDAO.updateUser(new BasicInfo(1520010912,"����һ",1,"1997-04-12",100013,915465));//�����û���Ϣ
		List<BasicInfo> newList = basicInfoDAO.queryAll(50, 10);//��ȡ50~60�û���Ϣ��list
		for (BasicInfo i:newList){
			System.out.print(i.getId());
			System.out.println(i.getName());
		}
	}
}
