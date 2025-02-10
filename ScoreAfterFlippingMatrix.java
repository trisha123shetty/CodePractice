class Solution {
    public int matrixScore(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        //making first elemt of the row as zero then only flipping
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0) {
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        //flipping the column only if num of zeros is greater than no of one
        for(int j=1;j<n;j++){
            int noOfZero=0, noOfOne=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0){
                   noOfZero++; 
                }else{
                   noOfOne++; 
                }
            }
            if(noOfZero > noOfOne){
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        //calculaion
        int score=0;
        int x=1;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                score+=(arr[i][j]*x);
            }
            x*=2;
        }
        return score;
    }
}