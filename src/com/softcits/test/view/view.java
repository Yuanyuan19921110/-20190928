package com.softcits.test.view;

import java.util.Scanner;

import com.softcits.dao.Userdao;
import com.softcits.test.entity.User01;

public class view {

	public static void main(String[] args) {
		
      System.out.println("��ӭ������������");
      System.out.println("��ѡ��1����¼ 2 ��ע��3��������");
      Scanner sc = new Scanner(System.in);
      int input=sc.nextInt();
      if(input==1) {
    	  System.out.println("�������˺�");
    	  String name=sc.next();
    	  System.out.println("����������");
    	  String passWord=sc.next();
    	  User01 user=new User01();
    	  Userdao userdao=new Userdao();
    	  if(userdao.login(user)) {
    		  System.out.println("��¼�ɹ�");
    	  }
    	  if(input==2) {
    		  
    	  }
      }
      
	}

}
