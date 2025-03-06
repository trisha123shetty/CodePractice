//Given an array of strings arr[] with all strings in lowercase. Sort given strings using Bubble Sort and
//display the sorted array. 
package BubbleSort;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"banana", "apple","orange","grape"};
		int n =arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
