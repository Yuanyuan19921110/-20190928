package lesson03;

import java.io.IOException;
import java.util.Scanner;

public class Practice07 {

	
		  // Complete the primality function below.
	static String primality(int n) {
	
	    	if(n==1)return"Not prime";
	        else if(n==2)return"prime" ;
	        else {
	        for(int i=2;i<=n;i++) 
	        if(n%i==0) return "Not prime";
	        }
	        return "prime";
	    
	  
	    }
	 

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        

	        int p = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int pItr = 0; pItr < p; pItr++) {
	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            String result = primality(n);
	            
	            System.out.println(result);
	            
	        }

	   

	        scanner.close();
	    

	}

}
