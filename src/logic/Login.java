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

	public int Register(int id,String account,String keyword,int headship) throws Exception{//0Ϊ�ɹ���1Ϊʧ��
		UserInfoDAO userinfodao1 = DAOFactory.getDAO("��¼��Ϣ");
		if(userinfodao1.addUser(new UserInfo(id,account,keyword,headship))==0){
			return 0;
		}else{
			return -1;
		}
		
	}
}
