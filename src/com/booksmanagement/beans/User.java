package com.booksmanagement.beans;

public class User {
	private Integer id;
	private String name;
	private String pwd;
	private int level;//管理员级别
	
	public User() {
		super();
	}
	public User(String name, String pwd, int level) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.level = level;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", level=" + level + "]";
	}
	
}
