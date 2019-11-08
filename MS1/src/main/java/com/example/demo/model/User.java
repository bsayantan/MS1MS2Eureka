package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String userid;
	private String password;
	private String name;
	private String emailid;
	
	/*public User(String userid, String password, String name, String emailid) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.emailid = emailid;
	}*/
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + ", name=" + name + ", emailid=" + emailid + "]";
	}
	

}
