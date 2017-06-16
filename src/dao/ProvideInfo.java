package dao;

public class ProvideInfo {//供应商信息表

	int id;//主键
	String cName;//供应商姓名
	String address;//供应商地址
	String linkMan;//联系人
	String linkPhone;//联系电话
	String faxes;//传真
	String postNum;//邮政编码
	String bankNum;//银行账号
	String netAddress;//主页
	String emailAddress;//电子邮箱地址
	String remark;//备注信息
	
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
	public ProvideInfo() {
		
		
	}
	public ProvideInfo(int id, String cName, String address, String linkMan,
			String linkPhone, String faxes, String postNum, String bankNum,
			String netAddress, String emailAddress, String remark) {
		super();
		this.id = id;
		this.cName = cName;
		this.address = address;
		this.linkMan = linkMan;
		this.linkPhone = linkPhone;
		this.faxes = faxes;
		this.postNum = postNum;
		this.bankNum = bankNum;
		this.netAddress = netAddress;
		this.emailAddress = emailAddress;
		this.remark = remark;
	}
	/**
	 * @return cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName 要设置的 cName
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address 要设置的 address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return linkMan
	 */
	public String getLinkMan() {
		return linkMan;
	}
	/**
	 * @param linkMan 要设置的 linkMan
	 */
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	/**
	 * @return linkPhone
	 */
	public String getLinkPhone() {
		return linkPhone;
	}
	/**
	 * @param linkPhone 要设置的 linkPhone
	 */
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	/**
	 * @return faxes
	 */
	public String getFaxes() {
		return faxes;
	}
	/**
	 * @param faxes 要设置的 faxes
	 */
	public void setFaxes(String faxes) {
		this.faxes = faxes;
	}
	/**
	 * @return postNum
	 */
	public String getPostNum() {
		return postNum;
	}
	/**
	 * @param postNum 要设置的 postNum
	 */
	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}
	/**
	 * @return bankNum
	 */
	public String getBankNum() {
		return bankNum;
	}
	/**
	 * @param bankNum 要设置的 bankNum
	 */
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}
	/**
	 * @return netAddress
	 */
	public String getNetAddress() {
		return netAddress;
	}
	/**
	 * @param netAddress 要设置的 netAddress
	 */
	public void setNetAddress(String netAddress) {
		this.netAddress = netAddress;
	}
	/**
	 * @return emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress 要设置的 emailAddress
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark 要设置的 remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
