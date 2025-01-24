package Problems;

public class SortZEroOneAndTwo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		int arr[]= {0,1,2,0,1,0,2,0};
//		int numOfzero=0;
//		int numOfOnes=0;
//		int numOfTwo=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==0) {
//				numOfzero++;
//			}else if(arr[i]==1) {
//				numOfOnes++;
//			}else {
//				numOfTwo++;
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(i<numOfzero) {
//				arr[i]=0;
//			}else if( i<(numOfOnes+numOfzero)) {
//				arr[i]=1;
//			}else {
//				arr[i]=2;
//			}
//		}
//		for(int ele:arr) {
//			System.out.println(ele+" ");
//		}
		//dutch flag algorithum
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
//				swap(arr[mid],arr[low]);
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
//				swap(arr[mid],arr[high]);
				high--;
			}
		}
		for(int ele:arr) {
			System.out.println(ele);
		}

	}

}
