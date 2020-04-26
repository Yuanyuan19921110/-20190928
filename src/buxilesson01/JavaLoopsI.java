package buxilesson01;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoopsI {

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int a =1;
	        for(;a<=10;a++) {
	             int result=(N*a);
	             
	             System.out.println(N+" "+"x"+" "+ a +" "+ "="+" " +N*a);
	            }
	        
	        scanner.close();
	    }
	}
