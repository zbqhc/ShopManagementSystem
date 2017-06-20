package logic;

import java.awt.List;
import java.sql.SQLException;

import dao.DAOFactory;
import dao.PaymentInfo;
import dao.PaymentInfoDAO;

public class Commodity {
//�˱�
    public List queryAllCommodity() throws SQLException{//��ѯ�����˱���Ϣ�������˱���
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		List list = (List) pay.QueryAll();
		return list;
	}
    public List queryDateCommodity(String date) throws SQLException{//��ѯ�����˱���Ϣ�������˱���
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		List list = (List) pay.QueryByDate(date);
		return list;
	}
    public List queryTypeCommodity(String type) throws SQLException{//��ѯ�����˱���Ϣ�������˱���
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		List list = (List) pay.QueryByType(type);
		return list;
	}
    public List querySIDCommodity(int sid) throws SQLException{//��ѯ�����˱���Ϣ�������˱���
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		List list = (List) pay.QueryBySID(sid);
		return list;
	}
	public boolean addCommodity(int id,int sid,String sname,int sQuantity,float trice,String remarks) throws SQLException{//�����������Ʒ���˵����У��ɹ�����true,ʧ�ܷ���false
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		boolean ac = pay.addRecord(new PaymentInfo(id,sid,sname,sQuantity,trice,remarks));
		return ac;
		
	}
	public boolean deleteCommodity(int id) throws SQLException{//ɾ���˱���ĳһ��������Ʒ��Ϣ���ɹ�����true,ʧ�ܷ���false
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		boolean dc =pay.delRecord(id);
		return dc;
		
	}
	public float clacCommodity() throws SQLException{//���������ܶ�
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		float cc = pay.calcProfit();
		return cc;
	}
	public float clacCommodityDate(String date) throws SQLException{//���������ܶ�
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		float cc = pay.calcProfitByDate(date);
		return cc;
	}
	public float clacCommodityType(String type) throws SQLException{//���������ܶ�
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		float cc = pay.calcProfitByType(type);
		return cc;
	}
	public float clacCommoditySID(int sid) throws SQLException{//���������ܶ�
		PaymentInfoDAO pay = DAOFactory.getDAO("�˵���Ϣ");
		float cc = pay.calcProfitBySID(sid);
		return cc;
	}
}
