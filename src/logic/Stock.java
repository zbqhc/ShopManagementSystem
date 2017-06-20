package logic;

import java.util.List;

import dao.DAOFactory;
import dao.JoinDepot;
import dao.JoinDepotDAO;

public class Stock {
//���
	 public List<JoinDepot> queryAllStock() throws Exception{
		 //��ѯ�����Ϣ�����ؿ���
		 JoinDepotDAO joindepot = DAOFactory.getDAO("�ֿ���Ϣ");
		 List<JoinDepot> list = joindepot.queryAll();
		return list;
			
		}
		public int addStock(int id,String oid,int dId,String wareName,String joinTime,float weight,int quantity,String remark) throws Exception{
			//��⣬�ɹ�����true,ʧ�ܷ���false
			 JoinDepotDAO joindepot1 = DAOFactory.getDAO("�ֿ���Ϣ");
			int as = joindepot1.addItem(new JoinDepot(id,oid,dId,wareName,joinTime,weight,quantity,remark));
			return as;
			
		}
		public int deleteStockAll(int id) throws Exception{//ĳ����Ʒ���д�����⣬�ɹ�����true,ʧ�ܷ���false
			JoinDepotDAO joindepot2 = DAOFactory.getDAO("�ֿ���Ϣ");
			int dsa =joindepot2.delItem(id);
			return dsa;
			
		}
		public int deleteStock(int id,int quantity) throws Exception{
			JoinDepotDAO joindepot3 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot3.queryById(id);
			
			int ds = joindepot3.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),quantity,idName.getRemark()));
			return ds;
			
		}
		public List<JoinDepot> queryStock(int id) throws Exception{//��ѯĳ��������
			JoinDepotDAO joindepot4 = DAOFactory.getDAO("�ֿ���Ϣ");
			List<JoinDepot> list =joindepot4.queryAll(id, 1);
			return list;
		}
		public List<JoinDepot> queryStockMiddle(int id,int number) throws Exception{//��ѯĳ��������
			JoinDepotDAO joindepot4 = DAOFactory.getDAO("�ֿ���Ϣ");
			List<JoinDepot> list =joindepot4.queryAll(id, number);
			return list;
		}
		public int modifyStockOid(int id,String oid) throws Exception{//�޸�ĳ�������ĳ�������Ϣ���ж��ٸ�����Ҫ���ٸ�����
			JoinDepotDAO joindepot5 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot5.queryById(id);
			
			int mso = joindepot5.updateItem(new JoinDepot(id,oid,idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return mso;
			
		}
		public int modifyStockDid(int id,int dId) throws Exception{//�޸�ĳ�������ĳ�������Ϣ���ж��ٸ�����Ҫ���ٸ�����
			JoinDepotDAO joindepot6 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot6.queryById(id);
			
			int msd = joindepot6.updateItem(new JoinDepot(id,idName.getOid(),dId,idName.getWareName(),idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return msd;
			
		}
		
		public int modifyStockWareName(int id,String wareName) throws Exception{//�޸�ĳ�������ĳ�������Ϣ���ж��ٸ�����Ҫ���ٸ�����
			JoinDepotDAO joindepot7 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot7.queryById(id);
			
			int mswn = joindepot7.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),wareName,idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return mswn;
			
		}
		public int modifyStockJoinTime(int id,String joinTime) throws Exception{//�޸�ĳ�������ĳ�������Ϣ���ж��ٸ�����Ҫ���ٸ�����
			JoinDepotDAO joindepot8 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot8.queryById(id);
			
			int msjt = joindepot8.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),joinTime,idName.getWeight(),idName.getQuantity(),idName.getRemark()));
			return msjt;
			
		}
		public int modifyStockWeight(int id,float weight) throws Exception{//�޸�ĳ�������ĳ�������Ϣ���ж��ٸ�����Ҫ���ٸ�����
			JoinDepotDAO joindepot9 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot9.queryById(id);
			
			int msw = joindepot9.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),weight,idName.getQuantity(),idName.getRemark()));
			return msw;
			
		}
		public int modifyStockQuantity(int id,int quantity) throws Exception{//�޸�ĳ�������ĳ�������Ϣ���ж��ٸ�����Ҫ���ٸ�����
			JoinDepotDAO joindepot10 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot10.queryById(id);
			
			int msq = joindepot10.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),quantity,idName.getRemark()));
			return msq;
			
		}
		public int modifyStockRemark(int id,String remark) throws Exception{//�޸�ĳ�������ĳ�������Ϣ���ж��ٸ�����Ҫ���ٸ�����
			JoinDepotDAO joindepot11 = DAOFactory.getDAO("�ֿ���Ϣ");
			JoinDepot idName = joindepot11.queryById(id);
			
			int msr = joindepot11.updateItem(new JoinDepot(id,idName.getOid(),idName.getdId(),idName.getWareName(),idName.getJoinTime(),idName.getWeight(),idName.getQuantity(),remark));
			return msr;
			
		}
		
	

}
