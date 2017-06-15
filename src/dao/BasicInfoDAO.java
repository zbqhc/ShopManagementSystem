package dao;

import java.util.List;

public interface BasicInfoDAO extends DAO {

	public void insert(BasicInfo basicMessage) throws Exception ;  
    // 修改操作  
    public void update(BasicInfo basicMessage) throws Exception ;  
    // 删除操作  
    public void delete(int userid) throws Exception ;  
    // 按ID查询操作  
    public BasicInfo queryById(int userid) throws Exception ;  
    // 查询全部  
    public List queryAll() throws Exception ;  
}
