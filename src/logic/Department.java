package logic;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import dao.DAOFactory;
import dao.DepartmentInfo;
import dao.DepartmentInfoDAO;

public class Department {
//����
	public List queryAllDepartment() throws SQLException{//��ѯ���ű����ز��ű�
		DepartmentInfoDAO depa = DAOFactory.getDAO("������Ϣ");
		List<DepartmentInfo> list = depa.queryAll();
		return list;
		
	}
	public boolean addDepartment(int id,String name,Map<String,Boolean> permitMap) throws SQLException{//��Ӳ��ű��ɹ�����true,ʧ�ܷ���false
		DepartmentInfoDAO depa = DAOFactory.getDAO("������Ϣ");
		boolean ad = depa.addDepartment(new DepartmentInfo(id,name,permitMap));
		
		return ad;
		
	}
	public boolean deleteDepartment(int id)throws SQLException{//ɾ�����ţ��ɹ�����true,ʧ�ܷ���false
		DepartmentInfoDAO depa = DAOFactory.getDAO("������Ϣ");
		boolean dd = depa.delDepartment(id);
		return dd;
		
	}
	
	public boolean modifyDepartmentName(int id,String name) throws SQLException{//�޸�ĳ�����ŵ�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		DepartmentInfoDAO depa = DAOFactory.getDAO("������Ϣ");
		DepartmentInfo d=depa.queryByID(id);
		boolean mdn = depa.updateDepartment(new DepartmentInfo(id,name,d.getPermitMap()));
		return mdn;
		
	}
	public boolean modifyDepartmentMap(int id,Map map) throws SQLException{//�޸�ĳ�����ŵ�ĳ����Ϣ���ж��ٸ�����Ҫ���ٸ�����
		DepartmentInfoDAO depa = DAOFactory.getDAO("������Ϣ");
		DepartmentInfo d=depa.queryByID(id);
		boolean mdm = depa.updateDepartment(new DepartmentInfo(id,d.getName(),map));
		return mdm;
		
	}
}
