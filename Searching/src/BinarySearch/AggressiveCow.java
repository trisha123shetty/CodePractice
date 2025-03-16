package BinarySearch;

public class AggressiveCow {

	public static boolean canWePlaceCow(int arr[], int k, int mid){
        int countOfCow=1;
        int lastCow=arr[0];
        for(int i=1;i<arr.length;i++){
        if(arr[i]-lastCow>=mid){
            countOfCow++;
            lastCow=arr[i];
             if(countOfCow==k){
            return true;
        }
        }
         
        }
      
        return false;
    }
    
    
    
    
    
    
    
    public static int aggressiveCows(int[] arr, int k) {
        // code here
        int n=arr.length;
       Arrays.sort(arr);
      
       int  low=1;
        int high=arr[n-1]-arr[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canWePlaceCow(arr,k,mid)==true){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
        
    }

}
