package logic;

import java.util.List;

import dao.DAOFactory;
import dao.ProvideInfo;
import dao.ProvideInfoDAO;

public class Supplier {
//������
	 public List queryAllSupplier() throws Exception{//��ѯ��Ӧ����Ϣ�����ع�Ӧ�̱�
			ProvideInfoDAO provideinfo = DAOFactory.getDAO("��Ӧ����Ϣ");
			List list = provideinfo.queryAll();
			return list;
			
		}
		public int addSupplier(int id,String cName,String address,String linkMan,String linkPhone,String faxes,String postNum,String bankNum,String netAddress,String emailAddress,String remark) throws Exception{//��ӹ�Ӧ����Ϣ���ɹ�����true,ʧ�ܷ���false
			ProvideInfoDAO provideinfo1 = DAOFactory.getDAO("��Ӧ����Ϣ");
			int as = provideinfo1.addUser(new ProvideInfo(id,cName,address,linkMan,linkPhone,faxes,postNum,bankNum,netAddress,emailAddress,remark));
			return as;
		}
		public int deleteSupplier(int id) throws Exception{//ɾ����Ӧ����Ϣ���ɹ�����true,ʧ�ܷ���false
			ProvideInfoDAO provideinfo2 = DAOFactory.getDAO("��Ӧ����Ϣ");
			int ds = provideinfo2.delUser(id);
			return ds;
		}
		public List querySupplier(int id) throws Exception{//��ѯĳ����Ӧ����Ϣ
			ProvideInfoDAO provideinfo3 = DAOFactory.getDAO("��Ӧ����Ϣ");
			List list = provideinfo3.queryAll(id, id);
			return list;
		}
		public int modifySupplierCName(int id,String cName) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo3 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo3.queryById(id);
			int msc = provideinfo3.updateUser(new ProvideInfo(id,cName,idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return msc;
			
		}
		public int modifySupplierAddress(int id,String address) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo4 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo4.queryById(id);
			int msa = provideinfo4.updateUser(new ProvideInfo(id,idName.getcName(),address,idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return msa;
			
		}
		public int modifySupplierLinkMan(int id,String linkMan) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo5 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo5.queryById(id);
			int mslm = provideinfo5.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),linkMan,idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslm;
			
		}
		public int modifySupplierLinkPhone(int id,String linkPhone) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo6 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo6.queryById(id);
			int mslp = provideinfo6.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),linkPhone,idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslp;
			
		}
		public int modifySupplierFaxes(int id,String faxes) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo7 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo7.queryById(id);
			int mslf = provideinfo7.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),faxes,idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslf;
			
		}
		public int modifySupplierPostNum(int id,String postNum) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo8 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo8.queryById(id);
			int mslpn = provideinfo8.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),postNum,idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslpn;
			
		}
		public int modifySupplierBankNum(int id,String bankNum) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo9 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo9.queryById(id);
			int mslbn = provideinfo9.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),bankNum,idName.getNetAddress(),idName.getEmailAddress(),idName.getRemark()));
			return mslbn;
			
		}
		public int modifySupplierNetAddress(int id,String netAddress) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo10 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo10.queryById(id);
			int mslna = provideinfo10.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),netAddress,idName.getEmailAddress(),idName.getRemark()));
			return mslna;
			
		}
		public int modifySupplierEmailAddress(int id,String emailAddress) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo11 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo11.queryById(id);
			int mslea = provideinfo11.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),emailAddress,idName.getRemark()));
			return mslea;
			
		}
		public int modifySupplierRemark(int id,String remark) throws Exception{//�޸�ĳ����Ӧ�̵�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
			ProvideInfoDAO provideinfo12 = DAOFactory.getDAO("��Ӧ����Ϣ");
			ProvideInfo idName = provideinfo12.queryById(id);
			int mslr = provideinfo12.updateUser(new ProvideInfo(id,idName.getcName(),idName.getAddress(),idName.getLinkMan(),idName.getLinkPhone(),idName.getFaxes(),idName.getPostNum(),idName.getBankNum(),idName.getNetAddress(),idName.getEmailAddress(),remark));
			return mslr;
			
		}
}
