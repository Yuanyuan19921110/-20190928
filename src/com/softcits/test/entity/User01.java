package com.softcits.test.entity;

public class User01 {
	private String UserId;
	private String Username;
	private String UserPassword;
	private String UserAdress;
	private String UserPhone;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserAdress() {
		return UserAdress;
	}
	public void setUserAdress(String userAdress) {
		UserAdress = userAdress;
	}
	public String getUserPhone() {
		return UserPhone;
	}
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	public User01(String userId, String username, String userPassword, String userAdress, String userPhone) {
		super();
		UserId = userId;
		Username = username;
		UserPassword = userPassword;
		UserAdress = userAdress;
		UserPhone = userPhone;
	}
	public User01() {
		super();
	}
	@Override
	public String toString() {
		return "User01 [UserId=" + UserId + ", Username=" + Username + ", UserPassword=" + UserPassword
				+ ", UserAdress=" + UserAdress + ", UserPhone=" + UserPhone + "]";
	}
	
	
}
