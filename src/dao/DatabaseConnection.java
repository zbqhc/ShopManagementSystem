package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	String className="org.sqlite.JDBC";
	String url="jdbc:sqlite:test.db";
	//String username="root";
	//String password="0000";
	public DatabaseConnection(){
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	public void close(){  
        try{  
            this.getConn().close() ;  
        }catch (Exception e){  
            System.out.println("数据库连接关闭失败");  
        }         
    }  
}
