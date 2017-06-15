package dao;

import java.util.List;

public interface ProvideInfoDAO extends DAO {

	public void insert(ProvideInfo provideInfo) throws Exception ;  
    // 修改操作  
    public void update(ProvideInfo provideInfo) throws Exception ;  
    // 删除操作  
    public void delete(int userid) throws Exception ;  
    // 按ID查询操作  
    public ProvideInfo queryById(int userid) throws Exception ;  
    // 查询全部  
    public List queryAll() throws Exception ; 
}
