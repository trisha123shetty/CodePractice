package multidimensionalArray;

public class MultiplicationOF2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{5,8,9},{5,8,6},{1,2,1}};
		int n=a.length;
		int m=a[0].length;
		int p=b.length;
		int q=b[0].length;
		if(m!=p) {
			System.out.println("multiplication is not posible");
		}else {
			int[][] c = new int[n][q];
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[0].length;j++) {
					for(int k=0;k<q;k++) {
						c[i][j]=a[i][k]*b[k][j]+c[i][j];
					}
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
			
	}

}
