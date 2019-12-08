package lesson06;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class lesson6solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
    	
    	int[] m=new int[100];
        for(int i=0;i<arr.length;i++){
           m[arr[i]-1]++;
           }
           int m_max=0;
           for(int i=0;i<m.length;i++){
           if(m[i]>m_max)
    	    m_max = m[i];
           }
    		     
         return	arr.length-m_max ;
            }
        	 
    		
		
    		
    	 
    	
    	 
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt(); 
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);
        
        System.out.println(result);

        scanner.close();
    }}

