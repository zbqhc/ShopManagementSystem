package logic;

import java.util.List;

import dao.BasicInfo;
import dao.BasicInfoDAO;
import dao.DAOFactory;
import dao.DetailInfo;
import dao.DetailInfoDAO;

public class DetailStaff {

	public List queryAllDetailStaff() throws Exception{//��ѯ��ϸԱ����������ϸԱ����
		DetailInfoDAO basicInfo = DAOFactory.getDAO("��ϸ��Ϣ");
		List list = basicInfo.queryAll();
		return list;
	}
	public int addDetailStaff(int id,String contact,String officePhone,String fax,String email,String faddress) throws Exception{
		//���Ա�����ɹ�����true,ʧ�ܷ���false
		DetailInfoDAO basicInfo1 = DAOFactory.getDAO("��ϸ��Ϣ");
		int as =basicInfo1.addUser(new DetailInfo(id,contact,officePhone,fax,email,faddress));
		
		return as;
			
		
	}
	public int deleteDetailStaff(int id) throws Exception{
		//ɾ��Ա�����ɹ�����true,ʧ�ܷ���false
		DetailInfoDAO basicInfo2 = DAOFactory.getDAO("��ϸ��Ϣ");
		int ds=basicInfo2.delUser(id);
		return ds;
		
	}
	public List queryDetailStaff(int id) throws Exception{
		//��ѯĳ��Ա��
		DetailInfoDAO basicInfo3 = DAOFactory.getDAO("��ϸ��Ϣ");
		List list = basicInfo3.queryAll(id, 1);
		return list;
	}
	public List queryDetailStaffMiddle(int id,int number) throws Exception{
		//��ѯĳ��Ա��
		DetailInfoDAO basicInfo3 = DAOFactory.getDAO("��ϸ��Ϣ");
		List list = basicInfo3.queryAll(id, number);
		return list;
	}
	public int modifyDetailStaffContact(int id,String contact) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		DetailInfoDAO basicInfo4 = DAOFactory.getDAO("��ϸ��Ϣ");
		DetailInfo idName = basicInfo4.queryById(id);
		int mdsc=basicInfo4.updateUser(new DetailInfo(id,contact,idName.getOfficePhone(),idName.getFax(),idName.getEmail(),idName.getFaddress()));
		return mdsc;
		
	}
	public int modifyDetailStaffOfficePhone(int id,String officePhone) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		DetailInfoDAO basicInfo5 = DAOFactory.getDAO("��ϸ��Ϣ");
		DetailInfo idName = basicInfo5.queryById(id);
		int mdsop=basicInfo5.updateUser(new DetailInfo(id,idName.getContact(),officePhone,idName.getFax(),idName.getEmail(),idName.getFaddress()));
		return mdsop;
		
	}
	public int modifyDetailStaffFax(int id,String fax) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		DetailInfoDAO basicInfo6 = DAOFactory.getDAO("��ϸ��Ϣ");
		DetailInfo idName = basicInfo6.queryById(id);
		int mdsf=basicInfo6.updateUser(new DetailInfo(id,idName.getContact(),idName.getOfficePhone(),fax,idName.getEmail(),idName.getFaddress()));
		return mdsf;
		
	}
	public int modifyDetailStaffEmail(int id,String email) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		DetailInfoDAO basicInfo7 = DAOFactory.getDAO("��ϸ��Ϣ");
		DetailInfo idName = basicInfo7.queryById(id);
		int mdse=basicInfo7.updateUser(new DetailInfo(id,idName.getContact(),idName.getOfficePhone(),idName.getFax(),email,idName.getFaddress()));
		return mdse;
		
	}
	public int modifyDetailStaffFaddress(int id,String faddress) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		DetailInfoDAO basicInfo8 = DAOFactory.getDAO("��ϸ��Ϣ");
		DetailInfo idName = basicInfo8.queryById(id);
		int mdsf=basicInfo8.updateUser(new DetailInfo(id,idName.getContact(),idName.getOfficePhone(),idName.getFax(),idName.getEmail(),faddress));
		return mdsf;
		
	}
}
