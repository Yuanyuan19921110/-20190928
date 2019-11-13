package lesson05;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Solution01 {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for(int i=0;i<N;i++) {
				if(N%i==0) { 
			    System.out.println("not werid");
				else 
			    System.out.println(" werid");}
			
	        
	        scanner.close();
	    }
	}

}
