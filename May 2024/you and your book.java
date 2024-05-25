class Solution {
    long max_Books(int arr[], int n, int k) {
        // Initialize the maximum books collected to 0
        long maxBooks = 0;
        // Current sum of the window
        long currentSum = 0;
        // Start of the window
        int start = 0;
        
        // Iterate over each stack
        for (int end = 0; end < n; end++) {
            // If the current stack's height is greater than k, reset the window
            if (arr[end] > k) {
                start = end + 1;
                currentSum = 0;
            } else {
                // Add the current stack's books to the current sum
                currentSum += arr[end];
                // Update the maximum books collected if the current sum is greater
                maxBooks = Math.max(maxBooks, currentSum);
            }
        }
        
        return maxBooks;
    }
}

