class Solution {
    static final int MOD = 1000000007;

    public int ways(int x, int y) {
        int[][] dp = new int[x + 1][y + 1];

        dp[0][0] = 1;
        for (int i = 1; i <= x; i++)
            dp[i][0] = dp[i - 1][0];
        for (int j = 1; j <= y; j++)
            dp[0][j] = dp[0][j - 1];

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

        return dp[x][y];
    }
}

