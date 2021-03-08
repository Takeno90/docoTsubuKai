package model;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String pass;

	public User (String name,String pass) {
		this.name = name;
		this.pass = pass;
	}
	public String getName() {
		return this.name;
	}
	public String getPass() {
		return this.pass;
	}
}
