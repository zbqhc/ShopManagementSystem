package logic;

import java.util.List;

import dao.DAOFactory;
import dao.JoinDepot;
import dao.JoinDepotDAO;

public class Stock {
//库存
	 public List<JoinDepot> queryAllStock() throws Exception{
		 //查询库存信息，返回库存表
		 JoinDepotDAO joindepot = DAOFactory.getDAO("仓库信息");
		 List<JoinDepot> list = joindepot.queryAll();
		return list;
			
		}
		public int addStock(int id,String oid,int dId,String wareName,String joinTime,float weight,int quantity,String remark) throws Exception{
			//入库，成功返回true,失败返回false
			 JoinDepotDAO joindepot1 = DAOFactory.getDAO("仓库信息");
			int as = joindepot1.addItem(new JoinDepot(id,oid,dId,wareName,joinTime,weight,quantity,remark));
			return as;
			
		}
		public int deleteStockAll(int id) throws Exception{//某件商品所有存货出库，成功返回true,失败返回false
			JoinDepotDAO joindepot2 = DAOFactory.getDAO("仓库信息");
			int dsa =joindepot2.delItem(id);
			return dsa;
			
		}
		public int deleteStock(int id,int quantity) throws Exception{
			JoinDepotDAO joindepot3 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot3.queryById(id);
			
			int ds = joindepot3.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),quantity,idName.getRemark()));
			return ds;
			
		}
		public List<JoinDepot> queryStock(int id) throws Exception{//查询某个货物库存
			JoinDepotDAO joindepot4 = DAOFactory.getDAO("仓库信息");
			List<JoinDepot> list =joindepot4.queryAll(id, 1);
			return list;
		}
		public List<JoinDepot> queryStockMiddle(int id,int number) throws Exception{//查询某个货物库存
			JoinDepotDAO joindepot4 = DAOFactory.getDAO("仓库信息");
			List<JoinDepot> list =joindepot4.queryAll(id, number);
			return list;
		}
		public int modifyStockOid(int id,String oid) throws Exception{//修改某个货物的某个库存信息，有多少个属性要多少个方法
			JoinDepotDAO joindepot5 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot5.queryById(id);
			
			int mso = joindepot5.updateItem(new JoinDepot(id,oid,idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return mso;
			
		}
		public int modifyStockDid(int id,int dId) throws Exception{//修改某个货物的某个库存信息，有多少个属性要多少个方法
			JoinDepotDAO joindepot6 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot6.queryById(id);
			
			int msd = joindepot6.updateItem(new JoinDepot(id,idName.getOid(),dId,idName.getWareName(),idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return msd;
			
		}
		
		public int modifyStockWareName(int id,String wareName) throws Exception{//修改某个货物的某个库存信息，有多少个属性要多少个方法
			JoinDepotDAO joindepot7 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot7.queryById(id);
			
			int mswn = joindepot7.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),wareName,idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return mswn;
			
		}
		public int modifyStockJoinTime(int id,String joinTime) throws Exception{//修改某个货物的某个库存信息，有多少个属性要多少个方法
			JoinDepotDAO joindepot8 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot8.queryById(id);
			
			int msjt = joindepot8.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),joinTime,idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return msjt;
			
		}
		public int modifyStockWeight(int id,float weight) throws Exception{//修改某个货物的某个库存信息，有多少个属性要多少个方法
			JoinDepotDAO joindepot9 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot9.queryById(id);
			
			int msw = joindepot9.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),weight,idName.getQuantity(),idName.getRemark()));
			return msw;
			
		}
		public int modifyStockQuantity(int id,int quantity) throws Exception{//修改某个货物的某个库存信息，有多少个属性要多少个方法
			JoinDepotDAO joindepot10 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot10.queryById(id);
			
			int msq = joindepot10.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),quantity,idName.getRemark()));
			return msq;
			
		}
		public int modifyStockRemark(int id,String remark) throws Exception{//修改某个货物的某个库存信息，有多少个属性要多少个方法
			JoinDepotDAO joindepot11 = DAOFactory.getDAO("仓库信息");
			JoinDepot idName = joindepot11.queryById(id);
			
			int msr = joindepot11.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),remark));
			return msr;
			
		}
		
	

}
