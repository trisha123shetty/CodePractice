package Recurrsion;

import java.util.Scanner;

public class PowerAandb {

	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		int ans=a*pow(a,b-1);
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=pow(a,b);
		System.out.println(ans);

	}

}
