package buxilesson01;

public class divisablesevenwhile {

	public static void main(String[] args) {
		//9223372036854775807
		/*
		 * long limit=9223372036854775807L; 
		 * long i=1L; 
		 * while(i*7>0 && i*7 <=limit) {
		 * System.out.println(i*7); i++; } }
		 */
		long i=1L;
		while(i<=9223372036854775807L && i%7==0&&i>0) {
	   
			System.out.println(i);
			i++;
			}
	}
	}



