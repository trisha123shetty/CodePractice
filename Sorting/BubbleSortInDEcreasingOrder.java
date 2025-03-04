package BubbleSort;

public class BubbleSortInDEcreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,80,60,40};
	    int n=arr.length;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-1-i;j++){
	            if(arr[i+1]>arr[i]){
	                int temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	            }
	        }
	    }
	    for(int ele:arr) {
	    	System.out.print(ele+" ");
	    }

	}

}
