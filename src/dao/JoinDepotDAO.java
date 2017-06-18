package dao;

import java.util.List;

public interface JoinDepotDAO extends DAO {
	public int addItem(JoinDepot joinDepot) throws Exception ;  
    // �޸Ĳ���  
    public int updateItem(JoinDepot joinDepot) throws Exception ;  
    // ɾ������  
    public int delItem(int itemid) throws Exception ;  
    // ��ID��ѯ����  
    public JoinDepot queryById(int itemid) throws Exception ;  
    // ��ѯȫ��  
    public List queryAll() throws Exception ; 

	public List queryAll(int limitFloor, int limitUpper) throws Exception ; 

}
