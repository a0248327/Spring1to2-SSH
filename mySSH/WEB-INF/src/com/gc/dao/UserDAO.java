package com.gc.dao;

import com.gc.vo.*;

public interface UserDAO {
	public abstract void createUser(User user);

	public abstract void updateUser(User user);

	public abstract void deleteUser(User user);

	public abstract User queryUser(String name);
}
