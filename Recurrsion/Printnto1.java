package Recurrsion;

import java.util.Scanner;


public class Printnto1 {

	public static void printn(int n) {
		if(n==0) {
			return;
		}

		System.out.println(n);
printn(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n= sc.nextInt();
		printn(n);
		
	}

}
