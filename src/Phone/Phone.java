package Phone;
public class Phone{
	private String logo="����";
	private double price=3999;
	private String color="��ɫ";
	public String location="����"	;	
	double  width=3;
	protected double  length=12;
	//���췽��=����
	//Ĭ����һ���޲ι��캯��
	//toString��չʾ����������д����
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
}