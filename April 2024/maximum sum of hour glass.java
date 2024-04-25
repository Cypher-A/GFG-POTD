class Solution {
    public int findMaxSum(int n, int m, int[][] mat) {
        // Initialize maxSum to a very small value
        int maxSum = Integer.MIN_VALUE;

        // Iterate over each cell in the matrix
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                // Check if it's possible to form an hourglass with the current cell
                if (i + 2 < n && j + 2 < m) {
                    // Calculate the sum of the hourglass
                    int sum = mat[i][j] + mat[i][j+1] + mat[i][j+2]
                            + mat[i+1][j+1]
                            + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
                    
                    // Update maxSum if the current hourglass sum is greater
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        // If no hourglass is found, return -1
        if (maxSum == Integer.MIN_VALUE) {
            return -1;
        }

        // Otherwise, return the maximum sum
        return maxSum;
    }
}
