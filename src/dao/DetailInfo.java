package dao;

public class DetailInfo {

	int id;//����
	int hid;//Ա����Ϣ�������Ϣ���Ӧ
	String contact;//��ϵ�绰
	String officePhone;//�칫�绰
	String fax;//����
	String email;//��������
	String faddress;//��ͥ��ַ
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	public DetailInfo() {
		
	}
	public DetailInfo(int id, int hid, String contact, String officePhone,
			String fax, String email, String faddress) {
		super();
		this.id = id;
		this.hid = hid;
		this.contact = contact;
		this.officePhone = officePhone;
		this.fax = fax;
		this.email = email;
		this.faddress = faddress;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return hid
	 */
	public int getHid() {
		return hid;
	}
	/**
	 * @param hid Ҫ���õ� hid
	 */
	public void setHid(int hid) {
		this.hid = hid;
	}
	/**
	 * @return contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact Ҫ���õ� contact
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
	 * @param officePhone Ҫ���õ� officePhone
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
	 * @param fax Ҫ���õ� fax
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
	 * @param email Ҫ���õ� email
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
	 * @param faddress Ҫ���õ� faddress
	 */
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	
	
	
}
