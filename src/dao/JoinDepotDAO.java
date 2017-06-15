package dao;

import java.util.List;

public interface JoinDepotDAO extends DAO {
	public void insert(JoinDepot joinDepot) throws Exception ;  
    // �޸Ĳ���  
    public void update(JoinDepot joinDepot) throws Exception ;  
    // ɾ������  
    public void delete(int userid) throws Exception ;  
    // ��ID��ѯ����  
    public JoinDepot queryById(int userid) throws Exception ;  
    // ��ѯȫ��  
    public List queryAll() throws Exception ; 

}
