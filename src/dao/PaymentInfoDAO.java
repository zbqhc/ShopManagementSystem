package dao;

import java.sql.SQLException;
import java.util.List;

public interface PaymentInfoDAO {

	public List<PaymentInfo> QueryAll();// ��ѯ������ˮ����Ϣ ������ ����list<payment>

	public List<PaymentInfo> QueryByDate(String date);// ��ѯָ��������ˮ����Ϣ ����string ʱ��
														// ���� list<payment>

	public boolean addRecord(PaymentInfo paymentInfo) throws SQLException;// ���һ����ˮ��¼ ���� payment����
														// ����boolean

	public boolean delRecord(int id) throws SQLException;// ɾ��һ����ˮ��Ϣ ����int ��¼�� ����boolean

	public float calcProfit() throws SQLException;// ���������ܶ� ������ ����int

	public float calcProfit(String date) throws SQLException;// ���㵱�����۶� ����string ����int
}
