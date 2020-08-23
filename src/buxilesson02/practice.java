package buxilesson02;

public class practice {

	public static void main(String[] args) {
	// 下列整型数组，求出数组元素的和，平均数，数组元素的最大值和最小值，并输出所求的结果。
  //78,64,35,92,48,98,87,94,80,83 
    int[] arr= {78,64,35,92,48,98,87,94,80,83};
    int sum=0;
    float average=0f;
    
    for(int i=0;i<arr.length;i++) {
    	sum +=arr[i];
    	}
    	average=sum/arr.length;
    	
	
    	int max_value=arr[0];
        int min_value=arr[0];
       for(int i=0;i<arr.length;i++) {
    	if(arr[i]>max_value) {
    		max_value=arr[i];  }
    		
    	if(arr[i]<min_value) {
       		min_value=arr[i];
    	}}
    	System.out.println(sum);
	    System.out.println(average);
        System.out.println(max_value); 
        System.out.println(min_value);
    }}

//    for(int j=0;j<arr.length;j++) {
//    	int max_value=arr[0];
//    	if(arr[j]>max_value) {
//    		max_value=arr[j];
//    		}
//    		System.out.println(max_value);    
//    }
//    	int min_value=arr[0];
//       for(int k=0;k<arr.length;k++) {
//        	if(arr[k]<min_value) {
//        		min_value=arr[k];
//        		}
//        		System.out.println(min_value); 
//   }

	

