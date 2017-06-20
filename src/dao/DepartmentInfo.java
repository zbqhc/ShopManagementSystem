package dao;

import java.util.Map;

public class DepartmentInfo {
	int id;
	String name;
	Map<String, Boolean> permitMap;
	public DepartmentInfo() {
		super();
	}
	public DepartmentInfo(int id, String name, Map<String, Boolean> permitMap) {
		super();
		this.id = id;
		this.name = name;
		this.permitMap = permitMap;
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
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return permitMap
	 */
	public Map<String, Boolean> getPermitMap() {
		return permitMap;
	}
	/**
	 * @param permitMap Ҫ���õ� permitMap
	 */
	public void setPermitMap(Map<String, Boolean> permitMap) {
		this.permitMap = permitMap;
	}
	
	
	
}
