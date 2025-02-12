package multidimensionalArray;

public class RowWithMaxOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[][]= {{1,1,1,1},{1,0,0,0},{1,1,1,0}};
		    int n=arr.length;
		    int m= arr[0].length;
		    int MaxOne=-1;
		    int index=-1;
		    for(int i=0;i<n;i++){
		         int NUmOfOne;
		        NUmOfOne=0;
		        for(int j=0;j<m;j++){
		           
		            if(arr[i][j]==1){
		                NUmOfOne++;
		            }
		        }
		        if(MaxOne<NUmOfOne){
		            MaxOne=NUmOfOne;
		            index=i;
		        }
		    }
		    System.out.println(index);
	}

}
