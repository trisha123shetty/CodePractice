package multidimensionalArray;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,3,2},{5,44,8}};
		int n=arr.length;
		int m=arr[0].length;
		int ans[][]=new int[n][m];
		for(int j=0;j<m;j++) {
			for(int i=0;i<n;i++) {
				ans[i][j]=arr[i][j];
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

	}

}
