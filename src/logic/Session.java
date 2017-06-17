package logic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Session {

	
	private int id;
	private String password;
	
	public Session(int id, String password) {
	
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.password=password;
	}
	public int getName() {
		return id;
	}
	public void setName(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private static String time;//当前系统时间
	public static void main(String args[]){
		SimpleDateFormat df = new SimpleDateFormat();
		time=df.format(new Date());
	}
}
