package dao;

public class PaymentInfo {

	int id;// 主键
	int sid;// 商品编号
	String sname;// 商品名称
	int sQuantity;// 商品数量
	float trice;// 商品单价;记正为卖出 负为退货
	String TimeStamp;// 时间
	String remarks; // 备注信息
	public PaymentInfo() {
		super();
		// TODO 自动生成的构造函数存根
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
	 * @param id 要设置的 id
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
	 * @param sid 要设置的 sid
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
	 * @param sname 要设置的 sname
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
	 * @param sQuantity 要设置的 sQuantity
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
	 * @param trice 要设置的 trice
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
	 * @param remarks 要设置的 remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
