package dao;

import java.util.List;

public interface BasicInfoDAO{

	public void addUser(BasicInfo basicMessage) throws Exception ;  
    // �޸Ĳ���  
    public void updateUser(BasicInfo basicMessage) throws Exception ;  
    // ɾ������  
    public void delUser(int userid) throws Exception ;  
    // ��ID��ѯ����  
    public BasicInfo queryById(int userid) throws Exception ;  
    // ��ѯȫ��  
    public List<BasicInfo> queryAll() throws Exception ;  
    public List<BasicInfo> queryAll(int LimitFloor,int LimitUpper) throws Exception ;  
    
   
}
