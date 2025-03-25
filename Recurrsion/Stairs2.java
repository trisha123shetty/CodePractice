package Recurrsion;

import java.util.Scanner;

public class Stairs2 {
	public static  int stairs(int n) {
		if(n<=3) {
			return n;
		}
		
		return stairs(n-1)+stairs(n-3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n= sc.nextInt();
		int ans= stairs(n);
		System.out.println(ans);

	}
}
