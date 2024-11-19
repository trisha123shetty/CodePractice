import java.util.* ;
import java.io.*; 

public class Solution {
  public static int getFloor(int arr[],int n, int x,int start,int end){
   
    int result=-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==x){
        result=arr[mid];
        return result;
      }else if(arr[mid]<x){
        result=arr[mid];
        start=mid+1;

      }else{
        end=mid-1;
      }
    }
    return result;
  }
  public static int getCeil(int arr[],int n, int x, int start ,int end){
   
    int result=-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==x){
        result=arr[mid];
        return result;
      }else if(arr[mid]<x){
        start=mid+1;

      }else{
                result=arr[mid];
        end=mid-1;
      }
    }
    return result;
  }
      public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int a1, a2;
       int start=0;
    int end=n-1;
      a1= getFloor(a,n,x,start,end);
      a2 = getCeil(a,n,x,start, end);
            int ans[]={a1,a2};
      return ans;
    }
    
}