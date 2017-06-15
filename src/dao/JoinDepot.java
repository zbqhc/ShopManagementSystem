package dao;

public class JoinDepot {

	int id;//主键
	String oid;//订货编号
	int dId;//仓库编号
	String wareName;//货品名称
	String joinTime;//入库时间
	float weight;//货品重量
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
	/**
	 * @return oid
	 */
	public String getOid() {
		return oid;
	}
	/**
	 * @param oid 要设置的 oid
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}
	/**
	 * @return dId
	 */
	public int getdId() {
		return dId;
	}
	/**
	 * @param dId 要设置的 dId
	 */
	public void setdId(int dId) {
		this.dId = dId;
	}
	/**
	 * @return wareName
	 */
	public String getWareName() {
		return wareName;
	}
	/**
	 * @param wareName 要设置的 wareName
	 */
	public void setWareName(String wareName) {
		this.wareName = wareName;
	}
	/**
	 * @return joinTime
	 */
	public String getJoinTime() {
		return joinTime;
	}
	/**
	 * @param joinTime 要设置的 joinTime
	 */
	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}
	/**
	 * @return weight
	 */
	public float getWeight() {
		return weight;
	}
	/**
	 * @param weight 要设置的 weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
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
