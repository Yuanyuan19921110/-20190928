package com.softcits.test.entity;
     public class User{
     public User() {
			super();
		}
	public User(String id, String name, String password, int age) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.age = age;
		}
	private String id;
     private String name;
     private String password;
     private int age;
     //µÇÂ¼·½·¨login
     public boolean login(String name,String password) {
      	if("admin".equals(name) && "123".equals(password)) {
      		return true;
      	     }
      	else{
              return false;
     }
     }
     public static void main(String[] args) {
    	 System.out.println("1".equals("2"));
     }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     }