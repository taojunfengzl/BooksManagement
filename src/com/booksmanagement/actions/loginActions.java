package com.booksmanagement.actions;

import java.util.List;

import com.booksmanagement.beans.User;
import com.booksmanagement.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class loginActions extends ActionSupport{
	private IUserService service;
	private User user;
	public IUserService getService() {
		return service;
	}
	public void setService(IUserService service) {
		this.service = service;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() {
		if(user!=null) {
			List<User> list=service.findUserByName(user);
			if(list.size()==1) {
				System.out.println("已成功登录！");
			return "success";
			}
			else {
				System.out.println("密码错误");
				return "login";
				
			}
		}else {
			System.out.println("对象为空");
			return "login";
		}
	}
}
