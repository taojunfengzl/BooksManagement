package com.booksmanagement.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.booksmanagement.beans.User;

public class UserDaoImpl implements IUserDao {

	SessionFactory session;
	
	public void setSession(SessionFactory session) {
		this.session = session;
	}
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(user);
	}

	@Override
	public void delUser(User user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(user);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		String hql="from User";
		return session.getCurrentSession().createQuery(hql).list();
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().load(User.class, id);
	}

}
