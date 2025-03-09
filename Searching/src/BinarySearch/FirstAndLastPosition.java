package BinarySearch;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,20,20,50,50,60};
		int ans[]= {-1,-1};
		int x=20;
		int n=arr.length;
		int left=0;
		int right=n-1;
		int lowerBound=n;
		int higherBound=n;
		boolean flag=false;
//		while(left<=right) {
//			int mid=left+(right-left)/2;
//			if(arr[mid]>x) {
//				right= mid-1;
//			}else if(arr[mid]<x) {
//				left=mid-1;
//			}else if(arr[mid]==x) {
//				flag=true;
//				break;
//			}
//		}
////		if(flag==false) {
////		System.out.println("not found");
////		}
//		
//		if(flag==true) {
//		left=0;
//		right=n-1;
//		while(left<=right) {
//			int mid=left+(right-left)/2;
//			if(arr[mid]>=x) {
//				lowerBound=Math.min(lowerBound, mid);
//				right=mid-1;
//			}else {
//				left=mid+1;
//			}
//		}
//		left=0;
//		right=n-1;
//		while(left<=right) {
//			int mid=left+(right-left)/2;
//			if(arr[mid]>x) {
//				higherBound=Math.min(higherBound, mid);
//				right=mid-1;
//			}
//			else {
//				left=mid+1;
//			}
//		}
//		}
//		System.out.println(higherBound+"higherBound");
//		System.out.println("lowrbound"+lowerBound);
		
		
		
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]>x) {
				right=mid-1;
			}else if(arr[mid]<x) {
				left=mid+1;
			}else {
				if(mid>0 &&arr[mid]==arr[mid-1]) {
					right=mid-1;
				}else {
					lowerBound=mid;
break;
				}
				
				
			}
		}
		left=0;
		right=n-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]>x) {
				right=mid-1;
			}else if(arr[mid]<x) {
				left=mid+1;
			}else {
				if(mid+1<n &&arr[mid]==arr[mid+1]) {
					left=mid+1;
				}else {
					higherBound=mid;
break;
				}
				
				
			}
		}
		System.out.println(lowerBound);
		System.out.println(higherBound);

	}

}
