package dao;

public class SessionInfo {

	String id;//会话id
	int uid;//用户id
	String timestamp;//时间戳
	
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
	 * @param id 要设置的 id
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
	 * @param uid 要设置的 uid
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
	 * @param timestamp 要设置的 timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
