package buxilesson02;

public class shuzu03 {

	public static void main(String[] args) {
		// 从小到大排序
	 Integer[] arr= {49,38,65,97,76,13};
      int min_index=0;
      int min_value=java.lang.Integer.MAX_VALUE;
      
      for(int i = 0 ; i< arr.length; i++) {
      for(int j=0;j<arr.length;j++) {
        if(arr [j] != null && arr[j] <= min_value) {
        	min_value=arr[j];
        	min_index=j;
        	}
    		  
    	  }
        System.out.println(min_value); 
        arr[min_index] = null;
		min_value = java.lang.Integer.MAX_VALUE;
    	  
      }

	}
	
}
