package entity;

public class Calculator {
	public String logo;
	public double price;
	public double length;
	public double width;
	public String color;
	//方法的重载：在同类中，方法名相同，参数不同：类型，个数，顺序int与a分离，变成double
	public double sum(int a,double b) {
		System.out.println("int+double");
		return a+b;
		}
	public double sum(int a,int b) {
		System.out.println("int+int");
			return a+b;
	    }
	public double sum(double a,double b) {
		System.out.println("double+double");
				return a+b;
	    }
	 public static void main(String[] args) {
		 //类默认会有一个无参构造方法
		 Calculator calculator =new Calculator();
		 //calculator.sum(1, 6);
		 System.out.println("结果为"+calculator.sum(2.1, 1));
	}


}
