package logic;

import java.awt.List;
import java.sql.SQLException;

import dao.DAOFactory;
import dao.PaymentInfo;
import dao.PaymentInfoDAO;

public class Commodity {
//账本
    public List queryAllCommodity() throws SQLException{//查询所有账本信息，返回账本表
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		List list = (List) pay.QueryAll();
		return list;
	}
    public List queryDateCommodity(String date) throws SQLException{//查询所有账本信息，返回账本表
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		List list = (List) pay.QueryByDate(date);
		return list;
	}
    public List queryTypeCommodity(String type) throws SQLException{//查询所有账本信息，返回账本表
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		List list = (List) pay.QueryByType(type);
		return list;
	}
    public List querySIDCommodity(int sid) throws SQLException{//查询所有账本信息，返回账本表
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		List list = (List) pay.QueryBySID(sid);
		return list;
	}
	public boolean addCommodity(int id,int sid,String sname,int sQuantity,float trice,String remarks) throws SQLException{//添加已销售商品到账单表中，成功返回true,失败返回false
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		boolean ac = pay.addRecord(new PaymentInfo(id,sid,sname,sQuantity,trice,remarks));
		return ac;
		
	}
	public boolean deleteCommodity(int id) throws SQLException{//删除账本中某一已销售商品信息，成功返回true,失败返回false
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		boolean dc =pay.delRecord(id);
		return dc;
		
	}
	public float clacCommodity() throws SQLException{//计算销售总额
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		float cc = pay.calcProfit();
		return cc;
	}
	public float clacCommodityDate(String date) throws SQLException{//计算销售总额
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		float cc = pay.calcProfitByDate(date);
		return cc;
	}
	public float clacCommodityType(String type) throws SQLException{//计算销售总额
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		float cc = pay.calcProfitByType(type);
		return cc;
	}
	public float clacCommoditySID(int sid) throws SQLException{//计算销售总额
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		float cc = pay.calcProfitBySID(sid);
		return cc;
	}
}
