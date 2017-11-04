package com.booksmanagement.service;

import java.util.List;

import com.booksmanagement.beans.User;

public interface IUserService {
	void addUser(User user);
	void delUser(User user);
	void modifyUser(User user);
	List<User> findAllUser();
	User findUserById(int id);
	List<User> findUserByName(User user);
}
