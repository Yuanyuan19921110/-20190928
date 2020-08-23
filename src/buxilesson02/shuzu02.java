package buxilesson02;

public class shuzu02 {

	public static void main(String[] args) {
		// 打印偶数个数和奇数序列
		int [] arr= {78,64,35,92,48,98,87,94,80,83};
		int even=0;
        for(int i:arr) {
        	if(i%2==0) 
        		even++;
        }System.out.println(even);
	
     for(int i:arr) {
    	 if(i%2!=0) {
    		 System.out.println(i+" ");
    	 }
    }
	}}
