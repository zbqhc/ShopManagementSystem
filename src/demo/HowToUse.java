package demo;

import java.util.List;

import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		UserInfoDAO userInfoDAO = DAOFactory.getDAO("��¼��Ϣ");//��dao������ȡdao��ʵ�ֶ���
		
		userInfoDAO.addUser(new UserInfo(150109339,"���15-9", "lntu", 15));// ����û� id �û��� ���� ְ��
		userInfoDAO.delUser(1520010924);						//ɾ���û�
		userInfoDAO.updateUser(1520010900, "new", 9999);		//�����û�����ְ�� ����==null ְ�� == -1 Ϊ������
		for (UserInfo i : (List<UserInfo>) userInfoDAO.queryAll(0,5)) {//��ȡ0~5ȫ�����ݣ�����Ϊ�����ȡȫ��
			System.out.println(i.getAccount());
		}
		userInfoDAO.checkUser(150109339, "lntu");				//�����û����뷵�� true false
	}
}
