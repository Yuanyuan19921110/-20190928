package com.softcits.test.entity;

public class DiscountImp extends Discount {

	@Override
	public double vipDiscount(User02 u, double money) {
		// TODO Auto-generated method stub
		double discount=1;
		if(u.getRole()==0) {
			discount=0.9;}
	  else if(u.getRole()==1) {
		  discount=0.8;}
	  else if(u.getRole()==2) {
		  discount=0.7;}
	  lse if(u.getRole()==3) {
		  discount=0.6;}
		
		return money*discount;
	}

	@Override
	public double fullDiscount(User02 u, double money) {
		// TODO Auto-generated method stub
		double discount=1;
		if(u.getRole()==0) {
			discount=0.9;}
	  else if(u.getRole()==1) {
		  discount=0.8;}
	  else if(u.getRole()==2) {
		  discount=0.7;}
	  else if(u.getRole()==3) {
		  discount=0.6;}
		double mon=money*discount;
		
		return mon-(int)(mon/1000)*100;
	}
	

}
