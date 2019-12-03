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
    	int[] equalizeArray_arr=new int[101];
    	for(int i=0;i<arr.length;i++)
    	 equalizeArray_arr[ arr[i] ]++;
    
    	int m=0;
    	for(int i=0;i<equalizeArray_arr.length;i++)
    		m=equalizeArray_arr[i]-arr[i] ;
    	 return m;
    	 
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
    }
}
