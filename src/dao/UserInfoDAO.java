package dao;

import java.util.List;

public interface UserInfoDAO extends DAO {

	public void insert(UserInfo userInfo) throws Exception ;  
    // 修改操作  
    public void update(UserInfo userInfo) throws Exception ;  
    // 删除操作  
    public void delete(int userid) throws Exception ;  
    // 按ID查询操作  
    public UserInfo queryById(int userid) throws Exception ;  
    // 查询全部  
    public List queryAll() throws Exception ; 
}
