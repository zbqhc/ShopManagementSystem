package dao;

public class PaymentInfo {

	int id;// ����
	int sid;// ��Ʒ���
	String sname;// ��Ʒ����
	int sQuantity;// ��Ʒ����
	float trice;// ��Ʒ����;����Ϊ���� ��Ϊ�˻�
	String TimeStamp;// ʱ��
	String remarks; // ��ע��Ϣ
	public PaymentInfo() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public PaymentInfo(int id, int sid, String sname, int sQuantity,
			float trice,  String remarks) {
		super();
		this.id = id;
		this.sid = sid;
		this.sname = sname;
		this.sQuantity = sQuantity;
		this.trice = trice;
		this.remarks = remarks;
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
	 * @return sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid Ҫ���õ� sid
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname Ҫ���õ� sname
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return sQuantity
	 */
	public int getsQuantity() {
		return sQuantity;
	}
	/**
	 * @param sQuantity Ҫ���õ� sQuantity
	 */
	public void setsQuantity(int sQuantity) {
		this.sQuantity = sQuantity;
	}
	/**
	 * @return trice
	 */
	public float getTrice() {
		return trice;
	}
	/**
	 * @param trice Ҫ���õ� trice
	 */
	public void setTrice(Float trice) {
		this.trice = trice;
	}
	/**
	 * @return timeStamp
	 */
	public String getTimeStamp() {
		return TimeStamp;
	}
	
	/**
	 * @return remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks Ҫ���õ� remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
