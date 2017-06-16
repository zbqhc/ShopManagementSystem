package dao;

public class UserInfo {

	int id;//主键
	String account;//帐户名
	String keyWord;//密码
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
	 * @return account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account 要设置的 account
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
	 * @param keyWord 要设置的 keyWord
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
