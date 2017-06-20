package logic;

import java.util.Map;

import dao.DAOFactory;
import dao.DepartmentInfo;
import dao.DepartmentInfoDAO;
import dao.SessionInfo;
import dao.SessionInfoDAO;
import dao.UserInfo;
import dao.UserInfoDAO;

public class Login {
//��¼
	public  String contrastLogin(int id,String password) throws Exception{
	
		//�������ݿ⣬ȡ���û���������
		UserInfoDAO userinfodao = DAOFactory.getDAO("��¼��Ϣ");
		
		
			if(userinfodao.checkUser(id, password)==0){//�û����������Ա�
				SessionInfoDAO sessioninfo = DAOFactory.getDAO("�Ự��Ϣ");
				return sessioninfo.getSessionInfo(id).getId();
				
			}else
			{
			return null;
			}
		
			
			
		
	}
	public Map Jurisdiction(String id){//Ȩ��
		DepartmentInfoDAO department = DAOFactory.getDAO("������Ϣ");
		UserInfoDAO userinfodao = DAOFactory.getDAO("��¼��Ϣ");
		SessionInfoDAO sessioninfo = DAOFactory.getDAO("�Ự��Ϣ");
		return null;
		
		
	}

	public int Register(int id,String account,String keyword,int headship) throws Exception{
		//ע���˺ţ�0Ϊ�ɹ���-1Ϊʧ��
		UserInfoDAO userinfodao1 = DAOFactory.getDAO("��¼��Ϣ");
		int r  =  userinfodao1.addUser(new UserInfo(id,account,keyword,headship));
		return r;
		
	}
	
	public int Canaellation(int id) throws Exception{
		//ע���˺ţ�0Ϊ�ɹ���-1Ϊʧ��
		UserInfoDAO userinfodao2 = DAOFactory.getDAO("��¼��Ϣ");
		int c =userinfodao2.delUser(id);
		return c;
	}
	public int Destroy(int uid){
		SessionInfoDAO sessioninfo = DAOFactory.getDAO("�Ự��Ϣ");
		int d =sessioninfo.destroySessionInfoByUID(uid);
		return d;
	}
	
//	public int modifyKeyword(int id,String keyword) throws Exception{
//		//�޸�����
//		UserInfoDAO userinfodao3 = DAOFactory.getDAO("��¼��Ϣ");
//		userinfodao3.updateUser(id, null, id);
//		return 0;
//		
//	}
}
