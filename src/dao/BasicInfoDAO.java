package dao;

import java.util.List;

public interface BasicInfoDAO{

	public int addUser(BasicInfo basicMessage) throws Exception ;  
    // 修改操作  
    public int updateUser(BasicInfo basicMessage) throws Exception ;  
    // 删除操作  
    public int delUser(int userid) throws Exception ;  
    // 按ID查询操作  
    public BasicInfo queryById(int userid) throws Exception ;  
    // 查询全部  
    public List<BasicInfo> queryAll() throws Exception ;  
    public List<BasicInfo> queryAll(int LimitFloor,int LimitUpper) throws Exception ;  
    
   
}
