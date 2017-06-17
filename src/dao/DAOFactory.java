package dao;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

//参考资料：http://blog.csdn.net/nuowei_senlin/article/details/57073655
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
			while (it.hasNext()) {
				String key = it.next();
				System.out.println(key + ":" + prop.getProperty(key));
			}
			in.close();
		} catch (FileNotFoundException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		String simplename = interfaceClass;
		if (prop.getProperty(interfaceClass) == null) {
			System.out.println("未找到");
			return null;
		}

		try {
			System.out.println(interfaceClass);
			return (T) Class.forName(prop.getProperty(interfaceClass))
					.newInstance();
		} catch (Exception e) {
			System.out.println();
			throw new ExceptionInInitializerError(e);
		}

	}

//	public static void main(String[] args) throws Exception {
//		// System.out.println(new BasicInfo());
//		BasicInfoDAO dao = (BasicInfoDAO) DAOFactory.getDAO("基本信息");
//		for (int i = 3000; i < 2000; i++) {
//			dao.addUser(new BasicInfo(i, "李天聪" + 1, 1, "1997-03-04", 10003 + i,
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
