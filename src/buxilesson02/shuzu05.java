package buxilesson02;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class shuzu05 {

	    // Complete the camelcase function below.
	    static int camelcase(String s) {
         char[] arr=s.toCharArray();
         int a=0;
         for(char c:arr) {  
         if(c>='A'&& c<='Z') {
        	a++; 
         }}
         return a+1;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scanner.nextLine();

	       int result = camelcase(s);

	       bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
