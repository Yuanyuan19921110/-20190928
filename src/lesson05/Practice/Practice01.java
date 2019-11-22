package lesson05.Practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Practice01 {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
    String[] numbers = {
    	        "zero", 
    	        "one",
    	        "two",
    	        "three",
    	        "four",
    	        "five",
    	        "six",
    	        "seven",
    	        "eight",
    	        "nine",
    	        "ten",
    	        "eleven",
    	        "twelve",
    	        "thirteen",
    	        "fourteen",
    	        "fifteen",
    	        "sixteen",
    	        "seventeen",
    	        "eighteen",
    	        "nineteen",
    	        "twenty",
    	        "twenty one",
    	        "twenty two",
    	        "twenty three",
    	        "twenty four",
    	        "twenty five",
    	        "twenty six",
    	        "twenty seven",
    	        "twenty eight",
    	        "twenty nine"
    };
    if(m==15) 
    	return"quarter past"+" "+numbers[h];
    else if(m==45)
    	return"quarter to"+ " "+numbers[h+1];
    else if(m==00)
    	return numbers[h]+ " o' clock";
    else if(m==30)
    	return"half past"+" "+numbers[h];
    else if(m==1)
    	return numbers[m]+" minute past"+" "+numbers[h];
    else if(m<30)
    	return numbers[m]+" minutes past"+" "+numbers[h];
    else if(m<45&&m>30)
    	return numbers[60-m]+" minutes to"+" "+numbers[h+1];
    else if(m<=59&&m>45)
    	return numbers[60-m]+" minutes to"+" "+numbers[h+1];
   return timeInWords(h, m);
    }

static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);
       
        System.out.println(result);
        
       
        scanner.close();
    }
}
