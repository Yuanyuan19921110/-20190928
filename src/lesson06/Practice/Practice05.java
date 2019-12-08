package lesson06.Practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Practice05 {

    // Complete the staircase function below.
    static void staircase(int n) {
    	 
		 
	     for(int c=1;c<=n;c++)  {
	    	 
	     for(int b=n-c;b>0;b--)  { 
			 
        System.out.print(" ");	
  }
		 for(int b=1;b<=c;b++) {
				  
		 System.out.print("#");
  }
		 	  
		 System.out.println();
  }
  }	
  

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
