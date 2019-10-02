import java.util.Scanner;

public class Test20190928 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//计算a+b*c
		int a = scan.nextInt();	
		int b = scan.nextInt();
		int c = scan.nextInt();	
		
		
		int ansewr=calculcate(a,b,c);
		System.out.println(ansewr);
		}
	
	public static int calculcate (int a ,int b,int c){
	int e = multiple(b,c);
	int f = add(a,e);
	return f;
	}
	
		
	public static int multiple(int b,int c) {
		return b*c;
		}
	
	
	public static int add(int a, int e) {
		return a+e;
		}
}
