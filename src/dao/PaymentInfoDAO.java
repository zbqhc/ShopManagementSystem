package dao;

import java.sql.SQLException;
import java.util.List;

public interface PaymentInfoDAO {//�����˱���

	public List<PaymentInfo> QueryAll() throws SQLException;// ��ѯ������ˮ����Ϣ ������ ����list<payment>

	public List<PaymentInfo> QueryByDate(String date) throws SQLException;// ��ѯָ��������ˮ����Ϣ ����string ʱ�� �� "2017/06/08"
														// ���� list<payment>
	
	public List<PaymentInfo> QueryByType(String type) throws SQLException;//��ѯָ��remarks������ˮ����Ϣ ����string  �� "����"

	public List<PaymentInfo> QueryBySID(int sid) throws SQLException;//��ѯָ��sid��Ʒ�����ˮ����Ϣ ����int  

	public boolean addRecord(PaymentInfo paymentInfo) throws SQLException;// ���һ����ˮ��¼ ���� payment���� payment������squantity�������� �����˻� remarks��ָ������ �� "����" "�˻�" "����" 
														// ����boolean

	public boolean delRecord(int id) throws SQLException;// ɾ��һ����ˮ��Ϣ ����int ��¼�� ����boolean

	public float calcProfit() throws SQLException;// ���������ܶ� ������ ����int

	public float calcProfitByDate(String date) throws SQLException;// ���㵱�����۶� ����string  �� "2017/06/08" ����int
	
	public float calcProfitBySID(int sid) throws SQLException;//����Ӫҵ��ָ��sid��Ʒ�����ˮ����Ϣ ����int 
	
	public float calcProfitByType(String type) throws SQLException;//����Ӫҵ��ָ��remarks������ˮ����Ϣ ����string  �� "����"
}
