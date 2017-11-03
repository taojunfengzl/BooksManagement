package com.booksmanagement.actions;

import javax.xml.ws.Action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends users{
	
	public String execute() {
		if(name==null) {
			return "login";
		}
		return "success";
	}
}
