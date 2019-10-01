import java.util.Scanner;

public class solution0928 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int answer = calculate(a,b,c);
		System.out.println(answer);
		//º∆À„a/b+c
		
	}
	
	public static int calculate(int a, int b, int c) {
		int m = divide(a,b);
		int result = add(m,c);
		return result;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
}


