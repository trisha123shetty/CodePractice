package BubbleSort;

public class SekectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,5,1};
		int n=arr.length;
//		int min= 0;
		for(int i=0;i<n;i++) {
			int min= i;

			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				
				}
			
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;	
				
				
		}
		for(int ele:arr) {
			System.out.print(ele+ " ");
		}
		
	}

}
