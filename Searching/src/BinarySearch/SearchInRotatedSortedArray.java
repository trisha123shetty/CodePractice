package BinarySearch;

public class SearchInRotatedSortedArray {

	
	    public int search(int[] arr, int target) {
	       int n =arr.length;
	       int left=0;
	       int right=n-1;
	   while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (arr[mid] == target) {
	                return mid;  // Found the target
	            }
	            
	            if (arr[mid] <= arr[right]) {  // Right half is sorted
	                if (arr[mid] < target && target <= arr[right]) {
	                    left = mid + 1;
	                } else {
	                    right = mid - 1;
	                }
	            } else {  // Left half is sorted
	                if (arr[left] <= target && target < arr[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }
	            }
	           
	       }
	       return -1;
	    }
	

}
