package multidimensionalArray;

public class PrintingMiddleRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,3,7,8,0}};
		int n=arr.length;
		int m=arr[0].length;
		String ans[][]= new String[n][m];
		int mid=n/2;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(j==mid){
		           
		                ans[i][j]=Integer.toString(arr[i][j]);
		        }
		            else if(i==mid){
		                    ans[i][j]=Integer.toString(arr[i][j]);
		                
		}
		            else{
		                ans[i][j]="*";
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

	


