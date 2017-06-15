package dao;

import java.util.List;

public interface JoinDepotDAO extends DAO {
	public void insert(JoinDepot joinDepot) throws Exception ;  
    // 修改操作  
    public void update(JoinDepot joinDepot) throws Exception ;  
    // 删除操作  
    public void delete(int userid) throws Exception ;  
    // 按ID查询操作  
    public JoinDepot queryById(int userid) throws Exception ;  
    // 查询全部  
    public List queryAll() throws Exception ; 

}
