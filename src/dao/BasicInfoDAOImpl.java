package dao;

import java.util.Date;
import java.util.List;

public class BasicInfoDAOImpl implements BasicInfoDAO {

	public void insert(BasicInfo basicMessage) throws Exception {
		// TODO �Զ����ɵķ������
		System.out.println("����ɹ�");
		
	}

	public void update(BasicInfo basicMessage) throws Exception {
		// TODO �Զ����ɵķ������
		
	}

	public void delete(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		
	}

	public BasicInfo queryById(int userid) throws Exception {
		// TODO �Զ����ɵķ������
		BasicInfo basicInfo = new BasicInfo(1520010900,"�Դ�",1,new Date("1999-08-04"),1001,9001);
		return basicInfo;
	}

	public List queryAll() throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	

}
