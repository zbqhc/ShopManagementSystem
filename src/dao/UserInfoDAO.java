package dao;

import java.util.List;

public interface UserInfoDAO extends DAO {

	public void insert(UserInfo userInfo) throws Exception ;  
    // �޸Ĳ���  
    public void update(UserInfo userInfo) throws Exception ;  
    // ɾ������  
    public void delete(int userid) throws Exception ;  
    // ��ID��ѯ����  
    public UserInfo queryById(int userid) throws Exception ;  
    // ��ѯȫ��  
    public List queryAll() throws Exception ; 
}
