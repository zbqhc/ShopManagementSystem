package dao;

import java.io.IOException;
import java.util.Properties;

//参考资料：http://blog.csdn.net/nuowei_senlin/article/details/57073655
public class DAOFactory {

	private static Properties prop = new Properties();  
        try {  
            prop.load(DAOFactory.class.getClassLoader().getResourceAsStream("daofactory.properties"));  
            System.out.println(DAOFactory.class.getClassLoader());
        } catch (IOException e) {  
            throw new RuntimeException(e);  
        }  
     
	
	@SuppressWarnings("unchecked")
	public static <T> T getDAO(Class <T> interfaceClass){
		String simplename = interfaceClass.getSimpleName();  
        System.out.println("简单类名是："+simplename);    //UserDao  
        String classname = prop.getProperty(simplename);   
		System.out.println(interfaceClass);
		
		
		try{
			return (T) Class.forName("dao.BasicInfo").newInstance();
		}catch (Exception e){
			System.out.println();
			throw new ExceptionInInitializerError(e);
		}
	}
      public static void main(String[] args) {
		//System.out.println(new BasicInfo());
		BasicInfo lloDao =(BasicInfo) DAOFactory.getDAO(BasicInfoDAO.class);
		}
	
}
