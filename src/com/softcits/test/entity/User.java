package com.softcits.test.entity;
     public class User{
  
	 public User() {
			super();
		}
	public User(String id, String name, String password, int role, String address, String phone) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.role = role;
			this.address = address;
			this.phone = phone;
		}
	private String id;
     private String name;
     private String password;
     private int role;
     private String address;
     private String phone;
     
     //��¼����login
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
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + ", address="
				+ address + ", phone=" + phone + "]";
	}
     
	 static User[] arr = new User[10];
     static {
     User u1 = new User("u1","admin","123",1,"����","155");
     User u2 = new User("u2","zhangsan","123",0,"����","134");
     User u3 = new User("u3","lisi","111",0,"��ɽ","188");
     arr [0]=u1;
     arr [1]=u2;
     arr [2]=u3;
     }
}