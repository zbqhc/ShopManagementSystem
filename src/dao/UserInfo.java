package dao;

public class UserInfo {//�û���Ϣ��

	int id;//����
	String account;//�ʻ���
	String keyWord;//����
	int headship;
	String timeStamp;
	
	
	public UserInfo(int id, String account, String keyWord, int headship) {
		super();
		this.id = id;
		this.account = account;
		this.keyWord = keyWord;
		this.headship = headship;
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



	/**
	 * @return headship
	 */
	public int getHeadship() {
		return headship;
	}



	/**
	 * @param headship Ҫ���õ� headship
	 */
	public void setHeadship(int headship) {
		this.headship = headship;
	}



	/**
	 * @return timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}



	



	public UserInfo() {
		
	}
	
}
