package BinarySearch;

public class KthMissingPositiveInteger {

	    public int findKthPositive(int[] arr, int k) {
	    //    for(int i=0;i<arr.length;i++){
	    //     if(arr[i]<=k){
	    //         k++;
	    //     }else{
	    //         break;
	    //     }
	    //    } 
	    //    return k;
	    int low=0;
	    int high=arr.length-1;
	    while(low<=high){
	        int mid=low+(high-low)/2;
	        int missing=arr[mid]-(mid+1);
	        if(missing<k){
	            low=mid+1;
	        }else{
	            high=mid-1;
	        }
	    }
	    return low+k;
	    }
	

}
