package lesson02;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		//º∆À„a/b+c
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int answer = calculate(a,b,c);
		System.out.println(answer);	
	}
	
	public static int calculate(int a, int b, int c) {
		int m = divide(a,b);
		int result = add(m,c);
		return result;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static int add(int a, int b) {
		return a+b;
    }
    }

