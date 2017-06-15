package dao;

import java.util.List;

public interface DetailInfoDAO extends DAO {

	public void insert(DetailInfo detailInfo) throws Exception ;  
    // �޸Ĳ���  
    public void update(DetailInfo detailInfo) throws Exception ;  
    // ɾ������  
    public void delete(int userid) throws Exception ;  
    // ��ID��ѯ����  
    public DetailInfo queryById(int userid) throws Exception ;  
    // ��ѯȫ��  
    public List queryAll() throws Exception ; 
}
