package dao;

public class ProvideInfo {//��Ӧ����Ϣ��

	int id;//����
	String cName;//��Ӧ������
	String address;//��Ӧ�̵�ַ
	String linkMan;//��ϵ��
	String linkPhone;//��ϵ�绰
	String faxes;//����
	String postNum;//��������
	String bankNum;//�����˺�
	String netAddress;//��ҳ
	String emailAddress;//���������ַ
	String remark;//��ע��Ϣ
	
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
	 * @param cName Ҫ���õ� cName
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
	 * @param address Ҫ���õ� address
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
	 * @param linkMan Ҫ���õ� linkMan
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
	 * @param linkPhone Ҫ���õ� linkPhone
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
	 * @param faxes Ҫ���õ� faxes
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
	 * @param postNum Ҫ���õ� postNum
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
	 * @param bankNum Ҫ���õ� bankNum
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
	 * @param netAddress Ҫ���õ� netAddress
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
	 * @param emailAddress Ҫ���õ� emailAddress
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
	 * @param remark Ҫ���õ� remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
