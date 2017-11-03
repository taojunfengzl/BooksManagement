package com.booksmanagement.actions;

import javax.xml.ws.Action;

import com.booksmanagement.beans.User;
import com.booksmanagement.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{
	
	protected IUserService service;
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
	public String execute() {
		if(user==null) {
			return "register";
		}else {
			System.out.println(service);
			System.out.println(user);
			user.setId(1);
			service.addUser(user);
			return "login";
		}
	}
}
