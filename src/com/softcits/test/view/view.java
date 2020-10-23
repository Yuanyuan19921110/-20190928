package com.softcits.test.view;

import java.util.Scanner;

import com.softcits.dao.Userdao;
import com.softcits.test.entity.User01;

public class view {

	public static void main(String[] args) {
		
      System.out.println("欢迎来到招商银行");
      System.out.println("请选择：1，登录 2 ，注册3，。。。");
      Scanner sc = new Scanner(System.in);
      int input=sc.nextInt();
      if(input==1) {
    	  System.out.println("请输入账号");
    	  String name=sc.next();
    	  System.out.println("请输入密码");
    	  String passWord=sc.next();
    	  User01 user=new User01();
    	  Userdao userdao=new Userdao();
    	  if(userdao.login(user)) {
    		  System.out.println("登录成功");
    	  }
    	  if(input==2) {
    		  
    	  }
      }
      
	}

}
