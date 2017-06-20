package logic;

import java.awt.List;
import java.sql.SQLException;

import dao.DAOFactory;
import dao.PaymentInfoDAO;

public class Commodity {
//账本
    public List queryAllCommodity() throws SQLException{//查询所有账本信息，返回账本表
		PaymentInfoDAO pay = DAOFactory.getDAO("账单信息");
		List list = (List) pay.QueryAll();
		return list;
	}
	public boolean addCommodity(int id,String name){//添加已销售商品到账单表中，成功返回true,失败返回false
		return false;
		
	}
	public boolean deleteCommodity(int id){//删除账本中某一已销售商品信息，成功返回true,失败返回false
		return false;
		
	}
	public void queryCommodity(int id){//查询某个已销售商品信息
		
	}
	public boolean modifyCommodity(int id,String name){//修改某个已销售商品的某个信息，有多少个属性要多少个方法
		return false;
		
	}
//退货
public void queryAllReturn(){//查询退货表，返回退货表
		
	}
	public boolean addReturn(int id,String name){//添加退货信息，成功返回true,失败返回false
		return false;
		
	}
	public boolean deleteReturn(int id){//删除某一条退货信息，成功返回true,失败返回false
		return false;
		
	}
	public void queryReturn(int id){//查询某一条退货信息
		
	}
	public boolean modifyReturn(int id,String name){//修改某个退货信息的某个信息，有多少个属性要多少个方法
		return false;
		
	}
}
