//Brute Force Solution
class Solution {
    public void setZeroes(int[][] matrix) {
       boolean firstRow = false, firstCol = false;

    // Set markers in first row and first column
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[0].length; j++)
        if (matrix[i][j] == 0) {
          if (i == 0) firstRow = true;
          if (j == 0) firstCol = true;
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }

    // Replace inner matrix
    for (int i = 1; i < matrix.length; i++)
      for (int j = 1; j < matrix[0].length; j++)
        if (matrix[i][0] == 0 || matrix[0][j] == 0)
          matrix[i][j] = 0;

    // Last remaining checks
    if (firstRow)
      for (int j = 0; j < matrix[0].length; j++)
        matrix[0][j] = 0;

    if (firstCol)
      for (int i = 0; i < matrix.length; i++)
        matrix[i][0] = 0; 
    }
}

//Better Solution

class Solution1 {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

     int[] row = new int[n];
int[] column = new int[m];
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(matrix[i][j]==0){
            row[i]=1;
            column[j]=1;
        }
    }
}
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]==1 || column[j]==1){
                matrix[i][j]=0;
            }
        }
    }

    }
}

//Optimal Solution
class Solution2 {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0=1;
     //int[] row = new int[n];=matrix[0][];
//int[] column = new int[m];matrix[][0];
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(matrix[i][j]==0){
            matrix[i][0]=0;
            if(j!=0){
                matrix[0][j]=0;
            }else{
                col0=0;
            }
        }
    }
}

for(int i=1;i<n;i++){
    for(int j=1;j<m;j++){
        if(matrix[i][j]!=0){
            if(matrix[i][0]==0||matrix[0][j]==0){
                matrix[i][j]=0;
            }
        }
    }
}
if(matrix[0][0]==0){
    for(int j=0;j<m;j++){
        matrix[0][j]=0;
    }
}
if(col0==0){
    for(int i=0;i<n;i++){
        matrix[i][0]=0;
    }
}

    }
}