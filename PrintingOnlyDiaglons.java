

public class PrintingOnlyDiaglons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
		int m=arr[0].length;
		int ans[][]= new int[n][m];
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(i%2==0){
		            if(j%2==0){
		                ans[i][j]=arr[i][j];
		            }
		            else{
		                ans[i][j]=0;
		            }
		        }
		         else{
		                if(j%2!=0){
		                    ans[i][j]=arr[i][j];
		                }else{
		                    ans[i][j]=0;
		                }
		            }
		        }
		        
		    }
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(ans[i][j]+" ");
		    }
		    System.out.println();
		    }


	}

}
