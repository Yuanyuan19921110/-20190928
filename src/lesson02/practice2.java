package lesson02;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// 计算a^2+(b%c-d)*e
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
        int e=scan.nextInt();
        
        int answer = calculate(a,b,c,d,e);
        System.out.println(answer);
    }
        
     public static int calculate(int a,int b,int c,int d,int e) {
        	int m=multiple(a);
        	int n=mod(b,c); 
        	int t=sub(n,d);
        	int u=multiple2(t,e);
        	int result=add(m,u);
        	return result;
    }
     
    public static int multiple(int a){ 
    	return a*a;
    //1.计算a^2
    } 
    
    public static int mod(int a,int b) {
    	return a%b;
    //2.计算b%c	
    }
    public static int sub(int a,int b) {
    	return a-b;
    //3.计算b,c取余后的值减去d
   
    }
    public static int multiple2(int a,int b) {
    	return a*b;
    //4.计算b%c-d的值乘e
    }
    public static int add(int a,int b) {
    	return a+b; 
    //5.计算a^2与(b%c-d)*e相加，得出结果。
    
    }
	}


