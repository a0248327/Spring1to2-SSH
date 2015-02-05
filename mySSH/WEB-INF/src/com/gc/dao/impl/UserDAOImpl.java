package com.gc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import com.gc.dao.UserDAO;
import com.gc.vo.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	private SessionFactory sessionFactory;
	private String hql = "from user u where u.username = ?";

	public void createUser(User user) {
		this.getHibernateTemplate().save(user);
	}

	public void updateUser(User user) {
		this.getHibernateTemplate().update(user);
	}

	public void deleteUser(User user) {
		this.getHibernateTemplate().delete(user);
	}

	public User queryUser(String name) {
		// try {
		// Session session = HibernateUtil.currentSession();
		//
		// Transaction tx= session.beginTransaction();
		//
		// User user = new User();
		//
		// user.setPassword("11");
		// user.setUsername("11");
		// session.save(user);
		// tx.commit();
		//
		// HibernateUtil.closeSession();
		// } catch (Exception ex) {
		// log.error("get isOkUser", ex);
		// ex.printStackTrace();
		// }
		// return true;

		List userList;
		if (this.getHibernateTemplate().find(hql, name) == null)
			userList = new ArrayList();
		else
			userList = this.getHibernateTemplate().find(hql, name);
		return (User) userList.get(0);
	}
}