package BinarySearch;

public class SmallestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {44,32,11,22};
		int n=arr.length;
		int max=-1;
		int target=5;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		//brute force
//		int d;
//		for(d=1;d<=max;d++) {
//			int ans=0;
//
//			for(int j=0;j<n;j++) {
//				if(arr[j]%d==0) {
//				ans+=arr[j]/d;
//				}else {
//					ans+=arr[j]/d+1;
//				}
//			}
//			
//			if(ans<=target) {
//				System.out.println(d);
//				break;
//			}
//		}

		
		// using binary search
		int d=0;
		int left=0;
		int right=max;
		while(left<=right) {
			int  mid=left+(right-left)/2;
			int ans=0;
			for(int i=0;i<n;i++) {
				if(arr[i]%mid==0) {
				ans+=arr[i]/mid;
				}
				else {
					ans+=arr[i]/mid+1;
				}
			}
			if(ans<=target) {
				d=mid;
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		System.out.println(d);
		
		
	}

}
