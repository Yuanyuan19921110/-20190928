package com.softcits.test.entity;

public class TestString {

	public static void main(String[] args) {
		String str1=new String("123");
		String str2=new String("123");
        System.out.println(str1==str2);//new出来新的两块地址，fasle
        String str3="123";
        String str4="123";
        System.out.println(str1==str3);//fasle
        System.out.println(str3==str4);//ture
 //StringBuffer是一个对象 在栈，堆，（数组）可以改变本身的，不用new，不改变内存的存储位置，可改变赋值。
        StringBuffer s =new StringBuffer("123");
        
	}

}
