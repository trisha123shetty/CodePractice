class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] ans = new int[2];
        int result=firstOccarance(nums,target);
        int result2=LastOccarance(nums,target);
        ans[0]=result;
        ans[1]=result2;
        return ans;
    }
    public int firstOccarance(int[] arr, int target){
         int first=0;
        int last=arr.length-1;
        int ans=-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==target){
                ans=mid;
                last=mid-1;
            }else if(target<arr[mid]){
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return ans;
    }
  public int LastOccarance(int[] arr, int target){
         int first=0;
        int last=arr.length-1;
        int ans=-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==target){
                ans=mid;
                first=mid+1;
            }else if(target<arr[mid]){
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return ans;
    }

}
