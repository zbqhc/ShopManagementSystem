package dao;

import java.util.List;

public interface ProvideInfoDAO extends DAO {

	public void insert(ProvideInfo provideInfo) throws Exception ;  
    // �޸Ĳ���  
    public void update(ProvideInfo provideInfo) throws Exception ;  
    // ɾ������  
    public void delete(int userid) throws Exception ;  
    // ��ID��ѯ����  
    public ProvideInfo queryById(int userid) throws Exception ;  
    // ��ѯȫ��  
    public List queryAll() throws Exception ; 
}
