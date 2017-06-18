package dao;

public class DetailInfo {//详细信息表

	int id;//主键
	String contact;//联系电话
	String officePhone;//办公电话
	String fax;//传真
	String email;//电子邮箱
	String faddress;//家庭地址
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	public DetailInfo() {
		
	}
	public DetailInfo(int id, String contact, String officePhone,
			String fax, String email, String faddress) {
		super();
		this.id = id;
		this.contact = contact;
		this.officePhone = officePhone;
		this.fax = fax;
		this.email = email;
		this.faddress = faddress;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact 要设置的 contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return officePhone
	 */
	public String getOfficePhone() {
		return officePhone;
	}
	/**
	 * @param officePhone 要设置的 officePhone
	 */
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	/**
	 * @return fax
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @param fax 要设置的 fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email 要设置的 email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return faddress
	 */
	public String getFaddress() {
		return faddress;
	}
	/**
	 * @param faddress 要设置的 faddress
	 */
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	
	
	
}
