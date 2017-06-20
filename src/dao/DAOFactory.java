package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

//�ο����ϣ�http://blog.csdn.net/nuowei_senlin/article/details/57073655
public class DAOFactory {

	// private static Properties prop = new Properties();

	@SuppressWarnings("unchecked")
	public static <T> T getDAO(String interfaceClass) {
		Properties prop = new Properties();
		try {
			FileInputStream in = new FileInputStream(
					"src/dao/daofactory.properties");
			prop.load(in);
			Iterator<String> it = prop.stringPropertyNames().iterator();
			System.out.println("=======����DAO���������Ϣ======");
			while (it.hasNext()) {
				String key = it.next();
				System.out.println(key + ":" + prop.getProperty(key));
			}
			System.out.println("=======DAO���������Ϣ����======\n");
			in.close();
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

		if (prop.getProperty(interfaceClass) == null) {
			System.out.println("δ�ҵ�");
			return null;
		}

		try {
			System.out.println("������ʵ������"+prop.getProperty(interfaceClass));
			System.out.println();
			return (T) Class.forName(prop.getProperty(interfaceClass))
					.newInstance();
		} catch (Exception e) {
			System.out.println();
			throw new ExceptionInInitializerError(e);
		}

	}

//	public static void main(String[] args) throws Exception {
//		// System.out.println(new BasicInfo());
//		BasicInfoDAO dao = (BasicInfoDAO) DAOFactory.getDAO("������Ϣ");
//		for (int i = 3000; i < 2000; i++) {
//			dao.addUser(new BasicInfo(i, "�����" + 1, 1, "1997-03-04", 10003 + i,
//					9123654 - i));
//			System.out.print(i);
//		}
//		List<BasicInfo> que = dao.queryAll();
//		for (BasicInfo basicInfo:que){
//			System.out.println(basicInfo.getId());
//		}
//		
//	}

}
