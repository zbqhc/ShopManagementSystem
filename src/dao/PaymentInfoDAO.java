package dao;

import java.sql.SQLException;
import java.util.List;

public interface PaymentInfoDAO {//财务账本表

	public List<PaymentInfo> QueryAll() throws SQLException;// 查询所有流水账信息 参数无 返回list<payment>

	public List<PaymentInfo> QueryByDate(String date) throws SQLException;// 查询指定日期流水账信息 参数string 时间 如 "2017/06/08"
														// 返回 list<payment>
	
	public List<PaymentInfo> QueryByType(String type) throws SQLException;//查询指定remarks类型流水账信息 参数string  如 "销售"

	public List<PaymentInfo> QueryBySID(int sid) throws SQLException;//查询指定sid商品编号流水账信息 参数int  

	public boolean addRecord(PaymentInfo paymentInfo) throws SQLException;// 添加一条流水记录 参数 payment对象 payment对象中squantity正记卖出 负记退货 remarks需指明内容 如 "销售" "退货" "购入" 
														// 返回boolean

	public boolean delRecord(int id) throws SQLException;// 删除一条流水信息 参数int 记录号 返回boolean

	public float calcProfit() throws SQLException;// 计算销售总额 参数无 返回int

	public float calcProfitByDate(String date) throws SQLException;// 计算当天销售额 参数string  如 "2017/06/08" 返回int
	
	public float calcProfitBySID(int sid) throws SQLException;//计算营业额指定sid商品编号流水账信息 参数int 
	
	public float calcProfitByType(String type) throws SQLException;//计算营业额指定remarks类型流水账信息 参数string  如 "销售"
}
