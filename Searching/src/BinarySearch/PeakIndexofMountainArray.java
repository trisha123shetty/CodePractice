package BinarySearch;

public class PeakIndexofMountainArray {
	    public static int peakIndexInMountainArray(int[] arr) {
	        int n=arr.length;
	        int left=1;
	        int right=n-2;
	        int mid=0;
	        while(left<=right){
	             mid=left+(right-left)/2;
	            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
	                return mid;
	            }
	            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
	                left=mid+1;
	            }else{
	                right=mid-1;
	            }
	        }
	        return mid;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,20,4};
		int ans=peakIndexInMountainArray(arr);
		System.out.println(ans);

	}

}
