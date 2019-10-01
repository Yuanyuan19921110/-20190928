import java.io.*;//前5行是什么意思
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {//?
      	// Hint: Type return a+b; below 
    	return (a+b);//return函数的意义？
   }

 public static void main(String[] args) {//主函数不应该是第一位嘛？
        Scanner in = new Scanner(System.in);//含义？
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);//形式参数 
        System.out.println(sum);
   }
}
