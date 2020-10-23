package com.softcits.test.entity;

public abstract class Discount {
	public abstract double vipDiscount(User02 u,double money);
	
	public abstract double fullDiscount(User02 u,double money);
}
