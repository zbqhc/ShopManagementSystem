package dao;

import java.util.List;

public interface DetailInfoDAO extends DAO {

	public void insert(DetailInfo detailInfo) throws Exception ;  
    // 修改操作  
    public void update(DetailInfo detailInfo) throws Exception ;  
    // 删除操作  
    public void delete(int userid) throws Exception ;  
    // 按ID查询操作  
    public DetailInfo queryById(int userid) throws Exception ;  
    // 查询全部  
    public List queryAll() throws Exception ; 
}
