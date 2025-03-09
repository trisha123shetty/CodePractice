package BinarySearch;

public class LoweBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,20,20,50,80,60};
	    int x=25;
	    int n=arr.length;
	    int left=0;
	    int right=n-1;
	    int lowerBound=n;
	    while(left<=right){
	        int mid=(left+right)/2;
	        if(arr[mid]>=x){
	        	lowerBound = mid;
//	            lowerBound= Math.max(lowerBound,mid);
	            right=mid-1;
	        }else{
	            left=mid+1;
	        }
	    }
	    System.out.println(lowerBound);

	}

}
