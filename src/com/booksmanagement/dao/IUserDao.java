package com.booksmanagement.dao;

import java.util.List;

import com.booksmanagement.beans.User;

public interface IUserDao {

	void insertUser(User user);
	void delUser(User user);

	void updateUser(User user);
	List<User> findAllUser();
	User findUserById(int id);

	

}
