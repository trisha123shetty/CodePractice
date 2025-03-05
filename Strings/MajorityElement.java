package BubbleSort;

class Solution {
    public int majorityElement(int[] arr) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int n=arr.length;
         for(int i=1;i<n;i++){
		        for(int j=i;j>=1;j--){
		            if(arr[j]<arr[j-1]){
		                int temp=arr[j];
		                arr[j]=arr[j-1];
		                arr[j-1]=temp;
		            }
                    else{
                        break;
                    }
		        }
                
		    }
        return arr[n/2];
    }
}
