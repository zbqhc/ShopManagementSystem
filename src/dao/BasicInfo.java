package dao;

import java.util.Date;

public class BasicInfo {

	int id;//ID
	String name;//姓名
	int sex;//性别1:男 0：女
	Date birth;//出生日期
	int dept;//部门
	int headship;//职务
	public BasicInfo(int id, String name, int sex, Date birth, int dept,
			int headship) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.dept = dept;
		this.headship = headship;
	}
	public BasicInfo() {
		System.out.println("basicinfo running");
		// TODO 自动生成的构造函数存根
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return sex
	 */
	public int getSex() {
		return sex;
	}
	/**
	 * @param sex 要设置的 sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	/**
	 * @return birth
	 */
	public Date getBirth() {
		return birth;
	}
	/**
	 * @param birth 要设置的 birth
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	/**
	 * @return dept
	 */
	public int getDept() {
		return dept;
	}
	/**
	 * @param dept 要设置的 dept
	 */
	public void setDept(int dept) {
		this.dept = dept;
	}
	/**
	 * @return headship
	 */
	public int getHeadship() {
		return headship;
	}
	/**
	 * @param headship 要设置的 headship
	 */
	public void setHeadship(int headship) {
		this.headship = headship;
	}
	
}
