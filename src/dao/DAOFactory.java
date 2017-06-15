package dao;

public class DAOFactory {

	public static DAO getDAO(String className){
		DAO dao = null;
		try{
			dao = (DAO) Class.forName(className).newInstance();
		}catch (Exception e){
			throw new ExceptionInInitializerError(e);
		}
		return dao;
	}
      
}
