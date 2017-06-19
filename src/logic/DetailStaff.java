package logic;

import java.util.List;

import dao.BasicInfo;
import dao.BasicInfoDAO;
import dao.DAOFactory;
import dao.DetailInfo;
import dao.DetailInfoDAO;

public class DetailStaff {

	public List queryAllDetailStaff() throws Exception{//查询详细员工表，返回详细员工表
		DetailInfoDAO basicInfo = DAOFactory.getDAO("详细信息");
		List list = basicInfo.queryAll();
		return list;
	}
	public int addDetailStaff(int id,String contact,String officePhone,String fax,String email,String faddress) throws Exception{
		//添加员工表，成功返回true,失败返回false
		DetailInfoDAO basicInfo1 = DAOFactory.getDAO("详细信息");
		int as =basicInfo1.addUser(new DetailInfo(id,contact,officePhone,fax,email,faddress));
		
		return as;
			
		
	}
	public int deleteDetailStaff(int id) throws Exception{
		//删除员工，成功返回true,失败返回false
		DetailInfoDAO basicInfo2 = DAOFactory.getDAO("详细信息");
		int ds=basicInfo2.delUser(id);
		return ds;
		
	}
	public List queryDetailStaff(int id) throws Exception{
		//查询某个员工
		DetailInfoDAO basicInfo3 = DAOFactory.getDAO("详细信息");
		List list = basicInfo3.queryAll(id, 1);
		return list;
	}
	public List queryDetailStaffMiddle(int id,int number) throws Exception{
		//查询某个员工
		DetailInfoDAO basicInfo3 = DAOFactory.getDAO("详细信息");
		List list = basicInfo3.queryAll(id, number);
		return list;
	}
	public int modifyDetailStaffContact(int id,String contact) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		DetailInfoDAO basicInfo4 = DAOFactory.getDAO("详细信息");
		DetailInfo idName = basicInfo4.queryById(id);
		int mdsc=basicInfo4.updateUser(new DetailInfo(id,contact,idName.getOfficePhone(),idName.getFax(),idName.getEmail(),idName.getFaddress()));
		return mdsc;
		
	}
	public int modifyDetailStaffOfficePhone(int id,String officePhone) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		DetailInfoDAO basicInfo5 = DAOFactory.getDAO("详细信息");
		DetailInfo idName = basicInfo5.queryById(id);
		int mdsop=basicInfo5.updateUser(new DetailInfo(id,idName.getContact(),officePhone,idName.getFax(),idName.getEmail(),idName.getFaddress()));
		return mdsop;
		
	}
	public int modifyDetailStaffFax(int id,String fax) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		DetailInfoDAO basicInfo6 = DAOFactory.getDAO("详细信息");
		DetailInfo idName = basicInfo6.queryById(id);
		int mdsf=basicInfo6.updateUser(new DetailInfo(id,idName.getContact(),idName.getOfficePhone(),fax,idName.getEmail(),idName.getFaddress()));
		return mdsf;
		
	}
	public int modifyDetailStaffEmail(int id,String email) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		DetailInfoDAO basicInfo7 = DAOFactory.getDAO("详细信息");
		DetailInfo idName = basicInfo7.queryById(id);
		int mdse=basicInfo7.updateUser(new DetailInfo(id,idName.getContact(),idName.getOfficePhone(),idName.getFax(),email,idName.getFaddress()));
		return mdse;
		
	}
	public int modifyDetailStaffFaddress(int id,String faddress) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		DetailInfoDAO basicInfo8 = DAOFactory.getDAO("详细信息");
		DetailInfo idName = basicInfo8.queryById(id);
		int mdsf=basicInfo8.updateUser(new DetailInfo(id,idName.getContact(),idName.getOfficePhone(),idName.getFax(),idName.getEmail(),faddress));
		return mdsf;
		
	}
}
