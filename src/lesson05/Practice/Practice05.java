package lesson05.Practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Practice05 {

// Complete the sockMerchant function below.
	    static int sockMerchant(int n, int[] ar) {
	int[] color_arr=new int[101];
	   //for(int i=0;i<ar.length;i++)
	   //color_arr[ ar[i] ]++;
	   for(int color:ar)
		   color_arr[ color]++;
	    //int index=ar[i];
	   //color_arr[index]++;}与上文写法一致
	    int sum =0;
	 //  for(int i=0;i<color_arr.length;i++)
	//	   sum +=color_arr[i]/2;
	   //sum= sum + color_arr[i]/2;是上文缩写前的原型
		  
	   for(int num:color_arr)
		   sum +=num/2;
	   return sum;
	  }
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = sockMerchant(n, ar);

	        System.out.println(result);

	        scanner.close();
	    }
	}

