package logic;

import java.text.SimpleDateFormat;
import java.util.Date;

import tools.Timenow;

public class Session {

	
	private int id;
	private String password;
	private static String time = Timenow.getTimeNow();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getTime() {
		return time;
	}
	public static void setTime(String time) {
		Session.time = time;
	}
	public Session(int id, String password) {
	
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.password=password;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	;//当前系统时间
	
}
