package model;

import java.io.Serializable;

public class User implements Serializable {
	private String userId;
	private String pass;

	public User(String userId,String pass) {
		this.userId = userId;
		this.pass = pass;
	}
	public String getUserId() {
		return this.userId;
	}
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}