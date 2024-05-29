class Solution {
    public static int findWinner(int n, int x, int y) {
        boolean[] dp = new boolean[n + 1];
        
        dp[0] = false;
        
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0 && !dp[i - 1]) {
                dp[i] = true;
            } else if (i - x >= 0 && !dp[i - x]) {
                dp[i] = true;
            } else if (i - y >= 0 && !dp[i - y]) {
                dp[i] = true;
            } else {
                dp[i] = false;
            }
        }
        
        return dp[n] ? 1 : 0;
    }
}
