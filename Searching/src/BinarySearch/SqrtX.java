package BinarySearch;

public class SqrtX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=16;
//		int res=1;
//		for(int i=0;i<16;i++) {
//			if(res*res==x) {
//				System.out.println(res);
//			}else {
//				res++;
//			}
//		}
		int left=1;
		int right=x;
		while(left<=right) {
			int mid=left+(right-left)/2;
			int res=mid;
			if(res*res>x) {
				right=mid-1;
			}else if(res*res<x) {
				left=mid+1;
			}else {
				System.out.println(res);
				break;
			}
		}
	}

}
