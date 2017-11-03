package com.booksmanagement.service;

import java.util.List;

import com.booksmanagement.beans.User;
import com.booksmanagement.dao.IUserDao;

public class UserServiceImpl implements IUserService {

	private IUserDao dao;
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		dao.insertUser(user);
	}

	@Override
	public void delUser(User user) {
		// TODO Auto-generated method stub
		dao.delUser(user);
	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		dao.updateUser(user);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return dao.findAllUser();
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return dao.findUserById(id);
	}

}
