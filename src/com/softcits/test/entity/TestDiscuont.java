package com.softcits.test.entity;

public class TestDiscuont {

	public static void main(String[] args) {
		User02 u=new User02();
		u.setRole(1);
		Discount d=new DiscountImp();//�������ͣ������ø���ķ���
		System.out.println(d.fullDiscount(u, 4000));
		
	
	}

}
