package Recurrsion;

import java.util.Scanner;

public class SumnTo1 {
	static int sum=0;
//	public static void sum(int n) {
//		
//		if(n==0) {
//			System.out.println(sum);
//			return ;
//		}
//		sum+=n;
//		sum(n-1);
//		
//	}
	
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		sum+=n+sum(n-1);
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int ans=sum(n);
		System.out.println(ans);
//		int ans=sum(n);
//		System.out.println(ans ,0);

	}

}
