package dao;

import java.io.IOException;
import java.util.Properties;

//�ο����ϣ�http://blog.csdn.net/nuowei_senlin/article/details/57073655
public class DAOFactory {

	private static Properties prop = new Properties();

	@SuppressWarnings("unchecked")
	public static <T> T getDAO(Class<T> interfaceClass) {
		try {
			prop.load(DAOFactory.class.getClassLoader().getResourceAsStream(
					"daofactory.properties"));
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		System.out.println(DAOFactory.class.getClassLoader());
		String simplename = interfaceClass.getSimpleName();
		System.out.println("�������ǣ�" + simplename); // UserDao
		String classname = prop.getProperty(simplename);
		System.out.println(interfaceClass);

		try {
			return (T) Class.forName("dao.BasicInfo").newInstance();
		} catch (Exception e) {
			System.out.println();
			throw new ExceptionInInitializerError(e);
		}
	}

	public static void main(String[] args) {
		// System.out.println(new BasicInfo());
		BasicInfo lloDao = (BasicInfo) DAOFactory.getDAO(BasicInfoDAO.class);
	}

}
