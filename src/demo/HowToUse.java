package demo;

import java.util.List;

import dao.*;

public class HowToUse {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		SessionDAO sessiondao = DAOFactory.getDAO("会话信息");//从dao工厂获取dao的实现对象
		
//		sessiondao.getSession(1520010925);
		sessiondao.destroySessionByID("E67EBC69F9A3F9493FB9FEBD1BDC0E37B168F7E5");
	}
}
