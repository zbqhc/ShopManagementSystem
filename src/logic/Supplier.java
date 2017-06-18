package logic;

import java.util.List;

import dao.DAOFactory;
import dao.ProvideInfo;
import dao.ProvideInfoDAO;

public class Supplier {
//供货商
	 public List queryAllSupplier() throws Exception{//查询供应商信息，返回供应商表
			ProvideInfoDAO provideinfo = DAOFactory.getDAO("供应商信息");
			List list = provideinfo.queryAll();
			return list;
			
		}
		public int addSupplier(int id,String cName,String address,String linkMan,String linkPhone,String faxes,String postNum,String bankNum,String netAddress,String emailAddress,String remark) throws Exception{//添加供应商信息，成功返回true,失败返回false
			ProvideInfoDAO provideinfo1 = DAOFactory.getDAO("供应商信息");
			int as = provideinfo1.addUser(new ProvideInfo(id,cName,address,linkMan,linkPhone,faxes,postNum,bankNum,netAddress,emailAddress,remark));
			return as;
		}
		public int deleteSupplier(int id) throws Exception{//删除供应商信息，成功返回true,失败返回false
			ProvideInfoDAO provideinfo2 = DAOFactory.getDAO("供应商信息");
			int ds = provideinfo2.delUser(id);
			return ds;
		}
		public List querySupplier(int id) throws Exception{//查询某个供应商信息
			ProvideInfoDAO provideinfo3 = DAOFactory.getDAO("供应商信息");
			List list = provideinfo3.queryAll(id, id);
			return list;
		}
		public int modifySupplierCName(int id,String cName) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo3 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo3.queryById(id);
			int msc = provideinfo3.updateUser(new ProvideInfo(id,cName,idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return msc;
			
		}
		public int modifySupplierAddress(int id,String address) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo4 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo4.queryById(id);
			int msa = provideinfo4.updateUser(new ProvideInfo(id,idName.getcName(),address,idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return msa;
			
		}
		public int modifySupplierLinkMan(int id,String linkMan) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo5 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo5.queryById(id);
			int mslm = provideinfo5.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),linkMan,idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslm;
			
		}
		public int modifySupplierLinkPhone(int id,String linkPhone) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo6 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo6.queryById(id);
			int mslp = provideinfo6.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),linkPhone,idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslp;
			
		}
		public int modifySupplierFaxes(int id,String faxes) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo7 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo7.queryById(id);
			int mslf = provideinfo7.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),faxes,idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslf;
			
		}
		public int modifySupplierPostNum(int id,String postNum) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo8 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo8.queryById(id);
			int mslpn = provideinfo8.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),postNum,idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslpn;
			
		}
		public int modifySupplierBankNum(int id,String bankNum) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo9 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo9.queryById(id);
			int mslbn = provideinfo9.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),bankNum,idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslbn;
			
		}
		public int modifySupplierNetAddress(int id,String netAddress) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo10 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo10.queryById(id);
			int mslna = provideinfo10.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),netAddress,idName.getEmailAddress(),idName.getRemark()));
			return mslna;
			
		}
		public int modifySupplierEmailAddress(int id,String emailAddress) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo11 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo11.queryById(id);
			int mslea = provideinfo11.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),emailAddress,idName.getRemark()));
			return mslea;
			
		}
		public int modifySupplierRemark(int id,String remark) throws Exception{//修改某个供应商的某个信息，有多少个属性要多少个方法
			ProvideInfoDAO provideinfo12 = DAOFactory.getDAO("供应商信息");
			ProvideInfo idName = provideinfo12.queryById(id);
			int mslr = provideinfo12.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),remark));
			return mslr;
			
		}
}
