package logic;

import java.awt.List;
import java.sql.SQLException;

import dao.DAOFactory;
import dao.PaymentInfoDAO;

public class Commodity {
//�˱�
    public List queryAllCommodity() throws SQLException{//��ѯ�����˱���Ϣ�������˱���
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		List list = (List) pay.QueryAll();
		return list;
	}
	public boolean addCommodity(int id,String name){//�����������Ʒ���˵����У��ɹ�����true,ʧ�ܷ���false
		return false;
		
	}
	public boolean deleteCommodity(int id){//ɾ���˱���ĳһ��������Ʒ��Ϣ���ɹ�����true,ʧ�ܷ���false
		return false;
		
	}
	public void queryCommodity(int id){//��ѯĳ����������Ʒ��Ϣ
		
	}
	public boolean modifyCommodity(int id,String name){//�޸�ĳ����������Ʒ��ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		return false;
		
	}
//�˻�
public void queryAllReturn(){//��ѯ�˻��������˻���
		
	}
	public boolean addReturn(int id,String name){//����˻���Ϣ���ɹ�����true,ʧ�ܷ���false
		return false;
		
	}
	public boolean deleteReturn(int id){//ɾ��ĳһ���˻���Ϣ���ɹ�����true,ʧ�ܷ���false
		return false;
		
	}
	public void queryReturn(int id){//��ѯĳһ���˻���Ϣ
		
	}
	public boolean modifyReturn(int id,String name){//�޸�ĳ���˻���Ϣ��ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		return false;
		
	}
}
