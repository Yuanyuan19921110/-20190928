package lesson02;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// ����a^2+(b%c-d)*e
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
    //1.����a^2
    } 
    
    public static int mod(int a,int b) {
    	return a%b;
    //2.����b%c	
    }
    public static int sub(int a,int b) {
    	return a-b;
    //3.����b,cȡ����ֵ��ȥd
   
    }
    public static int multiple2(int a,int b) {
    	return a*b;
    //4.����b%c-d��ֵ��e
    }
    public static int add(int a,int b) {
    	return a+b; 
    //5.����a^2��(b%c-d)*e��ӣ��ó������
    
    }
	}


