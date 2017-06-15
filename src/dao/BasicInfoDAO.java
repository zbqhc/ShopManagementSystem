package dao;

import java.util.List;

public interface BasicInfoDAO extends DAO {

	public void insert(BasicInfo basicMessage) throws Exception ;  
    // �޸Ĳ���  
    public void update(BasicInfo basicMessage) throws Exception ;  
    // ɾ������  
    public void delete(int userid) throws Exception ;  
    // ��ID��ѯ����  
    public BasicInfo queryById(int userid) throws Exception ;  
    // ��ѯȫ��  
    public List queryAll() throws Exception ;  
}
