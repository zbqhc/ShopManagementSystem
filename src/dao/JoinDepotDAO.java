package dao;

import java.util.List;

public interface JoinDepotDAO extends DAO {
	public int addItem(JoinDepot joinDepot) throws Exception ;  
    // 修改操作  
    public int updateItem(JoinDepot joinDepot) throws Exception ;  
    // 删除操作  
    public int delItem(int itemid) throws Exception ;  
    // 按ID查询操作  
    public JoinDepot queryById(int itemid) throws Exception ;  
    // 查询全部  
    public List queryAll() throws Exception ; 

	public List queryAll(int limitFloor, int limitUpper) throws Exception ; 

}
