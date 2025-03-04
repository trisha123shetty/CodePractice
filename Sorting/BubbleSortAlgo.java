package BubbleSort;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,2,1};
		for(int x=0;x<arr.length;x++) {
			boolean flag=true;

		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]<arr[i]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				flag=false;
			}
			
		}
		if(flag==true) {
			break;
		}
		}
		for(int ele:arr) {
			System.out.println(ele+" ");
		}

	}

}
