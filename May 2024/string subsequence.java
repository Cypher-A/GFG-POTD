class Solution {
    public static int countWays(String s1, String s2) {
        int MOD = 1000000007;
        int n = s1.length();
        int m = s2.length();
        
        // Create dp array
        int[][] dp = new int[n + 1][m + 1];
        
        // Base case: An empty subsequence can always be formed in exactly one way
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        
        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        // The answer is in dp[n][m]
        return dp[n][m];
    }
}

