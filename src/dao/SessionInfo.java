package dao;

public class SessionInfo {

	String id;//�Ựid
	int uid;//�û�id
	String timestamp;//ʱ���
	
	public SessionInfo(String id, int uid, String timestamp) {
		super();
		this.id = id;
		this.uid = uid;
		this.timestamp = timestamp;
	}
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return uid
	 */
	public int getUid() {
		return uid;
	}
	/**
	 * @param uid Ҫ���õ� uid
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp Ҫ���õ� timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
