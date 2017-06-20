package logic;

import java.util.List;

import dao.BasicInfo;
import dao.BasicInfoDAO;
import dao.DAOFactory;

public class Staff {

	//员工表
	public List<BasicInfo> queryAllStaff() throws Exception{//查询员工表，返回员工表
		BasicInfoDAO basicInfo = DAOFactory.getDAO("基本信息");
		List<BasicInfo> list = basicInfo.queryAll();
		return list;
	}
	public int addStaff(int id,String name,int sex,String birth,int dept,int headship) throws Exception{
		//添加员工表，成功返回true,失败返回false
		BasicInfoDAO basicInfo1 = DAOFactory.getDAO("基本信息");
		int as =basicInfo1.addUser(new BasicInfo(id,name,sex,birth,dept,headship));
		
		return as;
			
		
	}
	public int deleteStaff(int id) throws Exception{
		//删除员工，成功返回true,失败返回false
		BasicInfoDAO basicInfo2 = DAOFactory.getDAO("基本信息");
		int ds=basicInfo2.delUser(id);
		return ds;
		
	}
	public List<BasicInfo> queryStaff(int id) throws Exception{
		//查询某个员工
		BasicInfoDAO basicInfo3 = DAOFactory.getDAO("基本信息");
		List<BasicInfo> list = basicInfo3.queryAll(id, 1);
		return list;
	}
	public List<BasicInfo> queryStaffMiddle(int id,int number) throws Exception{
		//查询某个员工
		BasicInfoDAO basicInfo3 = DAOFactory.getDAO("基本信息");
		List<BasicInfo> list = basicInfo3.queryAll(id, number);
		return list;
	}
	public int modifyStaffName(int id,String name) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		BasicInfoDAO basicInfo4 = DAOFactory.getDAO("基本信息");
		BasicInfo idName = basicInfo4.queryById(id);
		int msn=basicInfo4.updateUser(new BasicInfo(id,name,idName.getSex(),idName.getBirth(),idName.getDept(),idName.getHeadship()));
		return msn;
		
	}
	public int modifyStaffSex(int id,int sex) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		BasicInfoDAO basicInfos = DAOFactory.getDAO("基本信息");
		BasicInfo idName = basicInfos.queryById(id);
		int mss=basicInfos.updateUser(new BasicInfo(id,idName.getName(),sex,idName.getBirth(),idName.getDept(),idName.getHeadship()));
		return mss;
		
	}
	public int modifyStaffBirth(int id,String birth) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		BasicInfoDAO basicInfo5 = DAOFactory.getDAO("基本信息");
		BasicInfo idName = basicInfo5.queryById(id);
		int msb=basicInfo5.updateUser(new BasicInfo(id,idName.getName(),idName.getSex(),birth,idName.getDept(),idName.getHeadship()));
		return msb;
		
	}
	public int modifyStaffDept(int id,int dept) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		BasicInfoDAO basicInfo5 = DAOFactory.getDAO("基本信息");
		BasicInfo idName = basicInfo5.queryById(id);
		int msd=basicInfo5.updateUser(new BasicInfo(id,idName.getName(),idName.getSex(),idName.getBirth(),dept,idName.getHeadship()));
		return msd;
		
	}
	public int modifyStaffHeadship(int id,int headship) throws Exception{
		//修改某个员工的某个信息，有多少个属性要多少个方法
		BasicInfoDAO basicInfo5 = DAOFactory.getDAO("基本信息");
		BasicInfo idName = basicInfo5.queryById(id);
		int msh=basicInfo5.updateUser(new BasicInfo(id,idName.getName(),idName.getSex(),idName.getBirth(),idName.getDept(),headship));
		return msh;
		
	}
	
}
