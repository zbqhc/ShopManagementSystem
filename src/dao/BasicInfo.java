package dao;

import java.util.Date;

public class BasicInfo {//������Ϣ��

	int id;//ID
	String name;//����
	int sex;//�Ա�1:�� 0��Ů
	String birth;//��������
	int dept;//����
	int headship;//ְ��
	
	public BasicInfo(int id, String name, int sex, String birth, int dept,
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
		// TODO �Զ����ɵĹ��캯�����
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
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
	 * @param name Ҫ���õ� name
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
	 * @param sex Ҫ���õ� sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	/**
	 * @return birth
	 */
	public String getBirth() {
		return birth;
	}
	/**
	 * @param string Ҫ���õ� birth
	 */
	public void setBirth(String string) {
		this.birth = string;
	}
	/**
	 * @return dept
	 */
	public int getDept() {
		return dept;
	}
	/**
	 * @param dept Ҫ���õ� dept
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
	 * @param headship Ҫ���õ� headship
	 */
	public void setHeadship(int headship) {
		this.headship = headship;
	}
	
}
