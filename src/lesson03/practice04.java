package lesson03;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int i=2;
		for(;i<a;i++) {
			if(a%i==0){
			System.out.println("no");
			
		}
			
		else { 
			System.out.println("yes"); }

	}
		
}}
