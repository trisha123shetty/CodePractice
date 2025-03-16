package BinarySearch;
import java.util.Arrays;
public class kokoEatingBanana {

	 public boolean kokoBanana(int[] arr, int mid, int h){
	        int count=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]%mid==0){
	                count+=arr[i]/mid;
	                if(count>h)
	                    return false;
	            }else{
	                count+=arr[i]/mid+1;
	                 if(count>h)
	                    return false;
	            }
	        }
	        // if(count<=h){
	        //     return true;
	        // }
	           return count <= h;  
	    }
	    public int minEatingSpeed(int[] arr, int h) {
	        int n=arr.length;
	        int low=1;
	        int high = Arrays.stream(arr).max().getAsInt();  // Get max pile size
	        int ans=high;
	        while(low<=high){
	            int mid=low+(high-low)/2;
	            if(kokoBanana(arr,mid,h)==true){
	                ans=mid;
	                high=mid-1;
	            }else{
	                                low=mid+1;

	            }
	        }
	        return ans;
	    }

}
