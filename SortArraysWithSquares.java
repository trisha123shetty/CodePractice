//Brute force

public class Solution {
    public int[] solve(int[] A) {
        int n= A.length;
        int squared[]= new int[n];
        for(int i=0;i<n;i++){
            squared[i]=A[i]*A[i];
        }
        sorting(squared ,n);
        return squared;
    }
    public static void sorting(int[] squared,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(squared[j]>squared[j+1]){
                    int temp=squared[j+1];
                    squared[j+1]=squared[j];
                    squared[j]=temp;
                }
            }
        }
    }
}

//Better Approach(using merge sort)
public class Solution2 {
    public int[] solve(int[] A) {
        int n = A.length;
        int squared[] = new int[n];
        for (int i = 0; i < n; i++) {
            squared[i] = A[i] * A[i];
        }
        mergeSorting(squared, n);
        return squared;
    }

    public static void mergeSorting(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int j = mid; j < n; j++) {
            right[j - mid] = array[j];
        }
        mergeSorting(left, mid);
        mergeSorting(right, n - mid);
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, k = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}

//Optimal Solution (Using two pointer)
public class Solution3 {
    public int[] solve(int[] A) {
        int n= A.length;
        int square[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=A[i]*A[i];
        }
        int head=0;
        int tail=n-1;
        for(int i=n-1;i>=0;i--){
            if(A[head]>A[tail]){
                square[i]=A[head];
                head++;
            }else{
                square[i]=A[tail];
                tail--;
            }
        }
        return square;
    }
    
    
}
