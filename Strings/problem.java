package BubbleSort;

public class problem {


	    public static void main(String[] args) {
	        int arr[] = {54, 22, 11, 60, 49};
	        int n = arr.length;
	        int var = 0; 

	        for (int i = 0; i < n; i++) {
	            int min = -1; 
	            for (int j = 0; j < n; j++) {
	                
	                if (arr[j] > 0 && (min == -1 || arr[j] < arr[min])) {
	                    min = j;
	                }
	            }

	           
	            if (min != -1) {
	                arr[min] = var; 
	                var--;
	            } else {
	                break; 
	            }
	        }

	       
	        for(int i=0;i<n;i++) {
	        	arr[i]*=-1;
	        }
	        for (int ele : arr) {
	            System.out.println(ele);
	        }
	    }
	
}
