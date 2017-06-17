package dao;

import java.util.List;

public interface BasicInfoDAO{

	public int addUser(BasicInfo basicMessage) throws Exception ;  
    // �޸Ĳ���  
    public int updateUser(BasicInfo basicMessage) throws Exception ;  
    // ɾ������  
    public int delUser(int userid) throws Exception ;  
    // ��ID��ѯ����  
    public BasicInfo queryById(int userid) throws Exception ;  
    // ��ѯȫ��  
    public List<BasicInfo> queryAll() throws Exception ;  
    public List<BasicInfo> queryAll(int LimitFloor,int LimitUpper) throws Exception ;  
    
   
}
