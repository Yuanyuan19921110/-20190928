package lesson03;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  int x=scan.nextInt();
		  int[]a_array=new int[x+1];//��������
		  
		   a_array [0]=1;
		   a_array [1]=2;
		   
	       for(int i=2;i<x+1;i++) {	 
	    
	    	a_array[i]=a_array[i-1]+a_array[i-2];
		}
	       
	      System.out.println(a_array[x]);
		}    
	    }