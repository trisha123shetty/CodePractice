package Recurrsion;

import java.util.Scanner;

public class LogarthiumPower {

	public static int power(int a, int b) {
		if(b==0) {
			return 1;
		}
		int ans=power(a,b/2);
		if(b%2!=0) {
			return ans*ans*a;
		}
			return ans*ans;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=power(a,b);
		System.out.println(ans);

	}

}
