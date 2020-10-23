package practice01;

public class TestInterface {
     public static void main(String[] args) {
		usb sb;
		sb =new Computer();
		sb.charge();
		Hdmi hdmi=new Phone();
		hdmi.show();
		
		Phone p=(Phone)hdmi;
		p.call();
		Computer b=(Computer)sb;
		b.internet();
	}
}
