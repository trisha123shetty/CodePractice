package BinarySearch;

public class Minimized_Maximum_Of_products_Distrubuted {
	    public boolean isPossible(int arr[], int n , int mid){
	        int stores=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]%mid==0){
	                stores+=arr[i]/mid;
	            }else{
	                stores+=arr[i]/mid+1;
	            }
	            
	        }
	        if(stores>n){
	            return false;
	        }
	        return true;
	    }
	    public int minimizedMaximum(int n, int[] arr) {
	        int length= arr.length;
	        int max=-1;
	        for(int i=0;i<length;i++){
	            if(max<arr[i]){
	                max=arr[i];
	            }
	        }
	        int low=1;
	        int high=max;
	        int ans=0;

	        while(low<=high){
	            int mid=low+(high-low)/2;
	            if(isPossible(arr, n, mid)){
	                ans=mid;
	                high=mid-1;
	            }else{
	                low=mid+1;
	            }
	        }
	 return ans;
	    }
	

}
