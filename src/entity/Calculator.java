package entity;

public class Calculator {
	public String logo;
	public double price;
	public double length;
	public double width;
	public String color;
	//���������أ���ͬ���У���������ͬ��������ͬ�����ͣ�������˳��int��a���룬���double
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
		 //��Ĭ�ϻ���һ���޲ι��췽��
		 Calculator calculator =new Calculator();
		 //calculator.sum(1, 6);
		 System.out.println("���Ϊ"+calculator.sum(2.1, 1));
	}


}
