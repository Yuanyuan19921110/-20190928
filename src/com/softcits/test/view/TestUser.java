package com.softcits.test.view;

import java.util.Scanner;

import com.softcits.test.entity.User;



public  class TestUser{
	 public static void main(String[] args) {
    	 System.out.println("�gӭ��xxϵ�y");
    	 System.out.println("Ոݔ��name");
    	 Scanner sc=new Scanner(System.in);
    	 String na =sc.next();
    	 System.out.println("Ոݔ��password");
    	 String pwd=sc.next();
    	 User u=new User();
    	 u.setName(na);
    	 u.setPassword(pwd);
    	 if(u.login(na, pwd)) {
    		 System.out.println("��䛳ɹ���"+"�gӭ�㣬"+na); 
    	 }
    	 else {
    		 System.out.println("���ʧ����"); 
    	 }
    	 
     }
     }