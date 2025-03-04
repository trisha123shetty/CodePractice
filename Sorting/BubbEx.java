package BubbleSort;

public class BubbEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};

		for(int i=0;i<arr.length-1;i++) {
			boolean flag=true;

			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					flag=false;
					System.out.println(flag);
				}
				
				
			}
			if(flag==true) break;
		}
		for(int ele:arr) {
			System.out.println(ele);
		}

	}

}
