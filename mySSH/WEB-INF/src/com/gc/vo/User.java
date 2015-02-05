package com.gc.vo;

import org.apache.struts.action.ActionForm;

public class User extends ActionForm {
	private String id = null;
	private String username = null;
	private String password = null;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}
}
