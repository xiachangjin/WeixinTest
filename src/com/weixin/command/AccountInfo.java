package com.weixin.command;

public class AccountInfo {

	private String name;
	private String password;
	
	public AccountInfo(String name, String pwd) {
		this.name = name;
		this.password = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
