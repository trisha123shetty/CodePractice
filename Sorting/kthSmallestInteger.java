package BubbleSort;

public class kthSmallestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,9,2,3};
		int k=3;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println(arr[k-1]);

	}

}
