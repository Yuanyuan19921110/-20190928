package com.softcits.test.entity;

public class TestString {

	public static void main(String[] args) {
		String str1=new String("123");
		String str2=new String("123");
        System.out.println(str1==str2);//new�����µ������ַ��fasle
        String str3="123";
        String str4="123";
        System.out.println(str1==str3);//fasle
        System.out.println(str3==str4);//ture
 //StringBuffer��һ������ ��ջ���ѣ������飩���Ըı䱾��ģ�����new�����ı��ڴ�Ĵ洢λ�ã��ɸı丳ֵ��
        StringBuffer s =new StringBuffer("123");
        
	}

}
