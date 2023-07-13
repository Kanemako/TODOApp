package model;

public class User {
	private String userName;
	private String pass;

	public User(String userName, String pass) {
		this.userName = userName;
		this.pass = pass;
	}

	public User() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
