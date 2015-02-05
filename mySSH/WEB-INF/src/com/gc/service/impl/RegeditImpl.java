/*
 * Created on 2006-5-15
 * TODO
 * author:gf
 */
package com.gc.service.impl;

import com.gc.dao.UserDAO;
import com.gc.service.Regedit;
import com.gc.vo.User;

public class RegeditImpl implements Regedit {
	private UserDAO userDao;

	public void saveUser(User user) {
		userDao.createUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	public User queryUser(String username) {
		return userDao.queryUser(username);
	}

	public void setUserDAO(UserDAO userDao) {
		this.userDao = userDao;
	}

	public UserDAO getUserDAO() {
		return this.userDao;
	}
}
