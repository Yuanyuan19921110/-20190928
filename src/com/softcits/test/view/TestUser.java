package com.softcits.test.view;

import java.util.Scanner;

import com.softcits.test.entity.User;



public  class TestUser{
	 public static void main(String[] args) {
    	 System.out.println("歡迎來到xx系統");
    	 System.out.println("請輸入name");
    	 Scanner sc=new Scanner(System.in);
    	 String na =sc.next();
    	 System.out.println("請輸入password");
    	 String pwd=sc.next();
    	 User u=new User();
    	 u.setName(na);
    	 u.setPassword(pwd);
    	 if(u.login(na, pwd)) {
    		 System.out.println("登錄成功！"+"歡迎你，"+na); 
    	 }
    	 else {
    		 System.out.println("登錄失敗！"); 
    	 }
    	 
     }
     }