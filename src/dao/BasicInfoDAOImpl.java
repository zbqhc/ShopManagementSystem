package dao;

import java.util.Date;
import java.util.List;

public class BasicInfoDAOImpl implements BasicInfoDAO {

	public void insert(BasicInfo basicMessage) throws Exception {
		// TODO 自动生成的方法存根
		System.out.println("插入成功");
		
	}

	public void update(BasicInfo basicMessage) throws Exception {
		// TODO 自动生成的方法存根
		
	}

	public void delete(int userid) throws Exception {
		// TODO 自动生成的方法存根
		
	}

	public BasicInfo queryById(int userid) throws Exception {
		// TODO 自动生成的方法存根
		BasicInfo basicInfo = new BasicInfo(1520010900,"赵大宝",1,new Date("1999-08-04"),1001,9001);
		return basicInfo;
	}

	public List queryAll() throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	

}
