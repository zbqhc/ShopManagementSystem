package dao;

public class UserInfo {

	int id;//����
	String account;//�ʻ���
	String keyWord;//����
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
	 * @return account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account Ҫ���õ� account
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * @return keyWord
	 */
	public String getKeyWord() {
		return keyWord;
	}
	/**
	 * @param keyWord Ҫ���õ� keyWord
	 */
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public UserInfo(int id, String account, String keyWord) {
		super();
		this.id = id;
		this.account = account;
		this.keyWord = keyWord;
	}
	public UserInfo() {
		
	}
	
}
