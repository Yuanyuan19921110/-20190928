package buxilesson03;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class practice03 {

	    //发送SOS信号的错误接受次数
	    static int marsExploration(String s) {
	     	int sosnum = s.length; 
	     	
	    	sos='SOS' * sosnum;
	    	  
	    		  int  counts = 0;
	    		 
	    		  for(i=0;i<s.length;i++) {
	    		  if(s[i] != sos[i]) {
	    		       counts += 1;
	    		       
	    		  }}
	    		    return result;
	    
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scanner.nextLine();

	        int result = marsExploration(s);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
