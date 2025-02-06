class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        int minR = 0;
        int maxR = n - 1;
        int minC = 0;
        int maxC = m - 1;

        while (minR <= maxR && minC <= maxC) {
            // Traverse from left to right along the top row
            for (int i = minC; i <= maxC; i++) {
                result.add(matrix[minR][i]);
            }
            minR++;

            // Traverse from top to bottom along the right column
            for (int i = minR; i <= maxR; i++) {
                result.add(matrix[i][maxC]);
            }
            maxC--;

            if (minR <= maxR) { // Check if there are still rows to traverse
                // Traverse from right to left along the bottom row
                for (int i = maxC; i >= minC; i--) {
                    result.add(matrix[maxR][i]);
                }
                maxR--;
            }

            if (minC <= maxC) { // Check if there are still columns to traverse
                // Traverse from bottom to top along the left column
                for (int i = maxR; i >= minR; i--) {
                    result.add(matrix[i][minC]);
                }
                minC++;
            }
        }

        return result; // Return the list containing the spiral order
    }
}
