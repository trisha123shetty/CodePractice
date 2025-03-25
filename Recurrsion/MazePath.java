package Recurrsion;

import java.util.Scanner;

public class MazePath {

//	public static int maze(int row, int col, int n,int m) {
//		if(row==m|| col==n) {
//			return 1;
//		}
//		int rightways= maze(row,col+1,n,m);
//		int downways=maze(row+1, col,n,m);
//		return rightways+downways;
//	}
	
	
	public static int maze( int n,int m) {
		if(m==1|| n==1) {
			return 1;
		}
		int rightways= maze(n-1,m);
		int downways=maze(n,m-1);
		return rightways+downways;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter m");
		int m=sc.nextInt();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println(maze(m,n));

	}

}
