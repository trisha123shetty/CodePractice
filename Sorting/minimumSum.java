//Given an array of digits (values are from 0 to 9), the task is to find the minimum possible sum of two
//numbers formed from digits of the array. Please note that all digits of the given array must be used to form
//the two numbers.



package BubbleSort;

public class minimumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,1,4,9};
		int n=arr.length;
		for(int i=1;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}else {
					break;
				}
			}
		}
		
		int mid=arr.length/2;
		int num=0;
		int num2=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
			num=num*10+arr[i];
			}
			else {
			num2=num2*10+arr[i];
			}
		}
		int sum=num+num2;
		System.out.println("sum is"+sum);
	}

}
