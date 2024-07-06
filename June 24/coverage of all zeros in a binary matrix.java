class Solution {
    public int findCoverage(int[][] matrix) {
        // Get the dimensions of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        int coverage = 0;
        
        // Directions array for moving left, right, up, and down
        int[][] directions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };
        
        // Iterate through each cell in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the current cell is 0, check its neighbors
                if (matrix[i][j] == 0) {
                    for (int[] direction : directions) {
                        int newRow = i + direction[0];
                        int newCol = j + direction[1];
                        
                        // Check if the neighboring cell is within bounds and is 1
                        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && matrix[newRow][newCol] == 1) {
                            coverage++;
                        }
                    }
                }
            }
        }
        
        return coverage;
    }
}
