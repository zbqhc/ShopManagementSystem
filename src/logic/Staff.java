package logic;

import java.util.List;

import dao.BasicInfo;
import dao.BasicInfoDAO;
import dao.DAOFactory;

public class Staff {

	//Ա����
	public List<BasicInfo> queryAllStaff() throws Exception{//��ѯԱ��������Ա����
		BasicInfoDAO basicInfo = DAOFactory.getDAO("������Ϣ");
		List<BasicInfo> list = basicInfo.queryAll();
		return list;
	}
	public int addStaff(int id,String name,int sex,String birth,int dept,int headship) throws Exception{
		//���Ա�����ɹ�����true,ʧ�ܷ���false
		BasicInfoDAO basicInfo1 = DAOFactory.getDAO("������Ϣ");
		int as =basicInfo1.addUser(new BasicInfo(id,name,sex,birth,dept,headship));
		
		return as;
			
		
	}
	public int deleteStaff(int id) throws Exception{
		//ɾ��Ա�����ɹ�����true,ʧ�ܷ���false
		BasicInfoDAO basicInfo2 = DAOFactory.getDAO("������Ϣ");
		int ds=basicInfo2.delUser(id);
		return ds;
		
	}
	public List<BasicInfo> queryStaff(int id) throws Exception{
		//��ѯĳ��Ա��
		BasicInfoDAO basicInfo3 = DAOFactory.getDAO("������Ϣ");
		List<BasicInfo> list = basicInfo3.queryAll(id, 1);
		return list;
	}
	public List<BasicInfo> queryStaffMiddle(int id,int number) throws Exception{
		//��ѯĳ��Ա��
		BasicInfoDAO basicInfo3 = DAOFactory.getDAO("������Ϣ");
		List<BasicInfo> list = basicInfo3.queryAll(id, number);
		return list;
	}
	public int modifyStaffName(int id,String name) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		BasicInfoDAO basicInfo4 = DAOFactory.getDAO("������Ϣ");
		BasicInfo idName = basicInfo4.queryById(id);
		int msn=basicInfo4.updateUser(new BasicInfo(id,name,idName.getSex(),idName.getBirth(),idName.getDept(),idName.getHeadship()));
		return msn;
		
	}
	public int modifyStaffSex(int id,int sex) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		BasicInfoDAO basicInfos = DAOFactory.getDAO("������Ϣ");
		BasicInfo idName = basicInfos.queryById(id);
		int mss=basicInfos.updateUser(new BasicInfo(id,idName.getName(),sex,idName.getBirth(),idName.getDept(),idName.getHeadship()));
		return mss;
		
	}
	public int modifyStaffBirth(int id,String birth) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		BasicInfoDAO basicInfo5 = DAOFactory.getDAO("������Ϣ");
		BasicInfo idName = basicInfo5.queryById(id);
		int msb=basicInfo5.updateUser(new BasicInfo(id,idName.getName(),idName.getSex(),birth,idName.getDept(),idName.getHeadship()));
		return msb;
		
	}
	public int modifyStaffDept(int id,int dept) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		BasicInfoDAO basicInfo5 = DAOFactory.getDAO("������Ϣ");
		BasicInfo idName = basicInfo5.queryById(id);
		int msd=basicInfo5.updateUser(new BasicInfo(id,idName.getName(),idName.getSex(),idName.getBirth(),dept,idName.getHeadship()));
		return msd;
		
	}
	public int modifyStaffHeadship(int id,int headship) throws Exception{
		//�޸�ĳ��Ա����ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		BasicInfoDAO basicInfo5 = DAOFactory.getDAO("������Ϣ");
		BasicInfo idName = basicInfo5.queryById(id);
		int msh=basicInfo5.updateUser(new BasicInfo(id,idName.getName(),idName.getSex(),idName.getBirth(),idName.getDept(),headship));
		return msh;
		
	}
	
}
