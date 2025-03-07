package BinarySearch;

public class BinarySearch {

		// TODO Auto-generated method stub
		 public  int search(int[] arr, int target) {
		      int n=arr.length;
		      int left=0;
		      int right=n-1;
		      while(left<=right){
		        int mid=(left+right)/2;
		        if(arr[mid]<target){
		            left=mid+1;
		        }else if(arr[mid]>target){
		            right=mid-1;
		        }else{
		            return mid;
		        }
		      }  
		      return -1;
		    }

	

}
