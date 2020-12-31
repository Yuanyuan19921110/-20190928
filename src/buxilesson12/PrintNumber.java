package buxilesson12;



public class PrintNumber implements Runnable{
		
	@Override
	public void run() {
		for (int i = 1; i <=9; i++) {
			System.out.println(i);
		}		
			
	}

}

