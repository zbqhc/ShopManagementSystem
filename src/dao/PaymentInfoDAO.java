package dao;

import java.sql.SQLException;
import java.util.List;

public interface PaymentInfoDAO {

	public List<PaymentInfo> QueryAll();// 查询所有流水账信息 参数无 返回list<payment>

	public List<PaymentInfo> QueryByDate(String date);// 查询指定日期流水账信息 参数string 时间
														// 返回 list<payment>

	public boolean addRecord(PaymentInfo paymentInfo) throws SQLException;// 添加一条流水记录 参数 payment对象
														// 返回boolean

	public boolean delRecord(int id) throws SQLException;// 删除一条流水信息 参数int 记录号 返回boolean

	public float calcProfit() throws SQLException;// 计算销售总额 参数无 返回int

	public float calcProfit(String date) throws SQLException;// 计算当天销售额 参数string 返回int
}
