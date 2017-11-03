package com.booksmanagement.actions;

import org.hibernate.SessionFactory;

import com.booksmanagement.beans.User;
import com.booksmanagement.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class users extends ActionSupport{
	protected IUserService service;
	protected int id;
	protected String name;
	protected String pwd;
	protected int level;
	protected User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setService(IUserService service) {
		this.service = service;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
}
