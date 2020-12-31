package buxilesson12;

public class TestPrint {

	public static void main(String[] args) {
		 new Thread(new PrintNumber()).start();
	     new Thread(new Printabc()).start();
			

	}

}
