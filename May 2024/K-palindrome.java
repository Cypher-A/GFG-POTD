class Solution {

    public static int kPalindrome(String str, int n, int k) {
        // Create a DP table
        int[][] dp = new int[n][n];

        // Fill the DP table
        for (int len = 1; len < n; len++) {
            for (int i = 0, j = len; j < n; i++, j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // Check if the number of deletions required is within the limit k
        return dp[0][n - 1] <= k ? 1 : 0;
    }

}
