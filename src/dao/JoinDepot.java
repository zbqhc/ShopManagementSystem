package dao;

public class JoinDepot {//�ֿ�����

	int id;//����
	String oid;//�������
	int dId;//�ֿ���
	String wareName;//��Ʒ����
	String joinTime;//���ʱ��
	float weight;//��Ʒ����
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
	public JoinDepot() {
		
	}
	public JoinDepot(int id, String oid, int dId, String wareName,
			String joinTime, float weight, String remark) {
		super();
		this.id = id;
		this.oid = oid;
		this.dId = dId;
		this.wareName = wareName;
		this.joinTime = joinTime;
		this.weight = weight;
		this.remark = remark;
	}
	/**
	 * @return oid
	 */
	public String getOid() {
		return oid;
	}
	/**
	 * @param oid Ҫ���õ� oid
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
	 * @param dId Ҫ���õ� dId
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
	 * @param wareName Ҫ���õ� wareName
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
	 * @param joinTime Ҫ���õ� joinTime
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
	 * @param weight Ҫ���õ� weight
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
	 * @param remark Ҫ���õ� remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
