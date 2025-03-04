package BubbleSort;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={1,2,4,5};
		    int n=arr.length;
		    for(int i=1;i<n;i++){
		        for(int j=i;j>=1;j--){
		            if(arr[j]<arr[j-1]){
		                int temp=arr[j];
		                arr[j]=arr[j-1];
		                arr[j-1]=temp;
		                System.out.println(j);
		            }else break;
		        }
		    }
		        for(int ele:arr) {
		        	System.out.println(ele);
		        }
	}

}
