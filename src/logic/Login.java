package logic;

import dao.DAOFactory;
import dao.UserInfo;
import dao.UserInfoDAO;

public class Login {
//��¼
	public  Session contrastLogin(int id,String password) throws Exception{
	
		//�������ݿ⣬ȡ���û���������
		UserInfoDAO userinfodao = DAOFactory.getDAO("��¼��Ϣ");
		
		
			if(userinfodao.checkUser(id, password)==0){//�û����������Ա�
				return new Session(id,password);
			}else
			{
			return null;
			}
		
			
			
		
	}

	public int Register(int id,String account,String keyword,int headship) throws Exception{
		//ע���˺ţ�0Ϊ�ɹ���-1Ϊʧ��
		UserInfoDAO userinfodao1 = DAOFactory.getDAO("��¼��Ϣ");
		int r  =  userinfodao1.addUser(new UserInfo(id,account,keyword,headship));
		if(r==0){
			return 0;
		}else{
			return -1;
		}
		
	}
	
	public int Canaellation(int id) throws Exception{
		//ע���˺ţ�0Ϊ�ɹ���-1Ϊʧ��
		UserInfoDAO userinfodao2 = DAOFactory.getDAO("��¼��Ϣ");
		int c =userinfodao2.delUser(id);
		if(c==0){
		return 0;
		}
		else{
		return -1;	
		}
	}
	
//	public int modifyKeyword(int id,String keyword) throws Exception{
//		//�޸�����
//		UserInfoDAO userinfodao3 = DAOFactory.getDAO("��¼��Ϣ");
//		userinfodao3.updateUser(id, null, id);
//		return 0;
//		
//	}
}
