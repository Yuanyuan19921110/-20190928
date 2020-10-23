package com.softcits.dao;

import com.softcits.test.entity.User01;

public class Userdao {
	static User01[]arr=new User01[20];
	
	static {
	User01 user=new User01("u1", "admin", "123", "大连", "13478148697"); 
	User01 user1=new User01("u2", "z", "456", "大连", "13478148697");
	
	arr[0]=user;
	arr[1]=user1;
	}
	public boolean checkName(String username) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null&&arr[i].getUsername().equals(username)) {
				return false;
			}
		}
	//查询所有，返回一个数组
	public User01[] selectAll(){
		return arr;
		}
		public static void main(String[] args) {
			Userdao userdao = new Userdao();
			userdao.selectAll();
			User[] =new 
			
			
			
		}
	
	}
	public boolean login(User01 user) {
	for (int i = 0; i < arr.length; i++) {
	if(arr[i]!=null&& arr[i].getUsername().equals(user.getUsername())&&
			arr[i].getUserPassword().equals(user.getUserPassword())) {
			return true;
		}
	}
    return false;
    
   }
}