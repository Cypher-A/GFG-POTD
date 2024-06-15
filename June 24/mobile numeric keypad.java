class Solution {
    public long getCount(int n) {
        if (n == 1) return 10;

        // Adjacency list for each key on the keypad
        int[][] moves = {
            {0, 8},    // from 0
            {1, 2, 4}, // from 1
            {2, 1, 3, 5}, // from 2
            {3, 2, 6}, // from 3
            {4, 1, 5, 7}, // from 4
            {5, 2, 4, 6, 8}, // from 5
            {6, 3, 5, 9}, // from 6
            {7, 4, 8}, // from 7
            {8, 5, 7, 9, 0}, // from 8
            {9, 6, 8} // from 9
        };

        // DP array to store the count of sequences of length i ending in digit j
        long[][] dp = new long[n + 1][10];

        // Initialize base case: sequences of length 1
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        // Fill the DP array
        for (int length = 2; length <= n; length++) {
            for (int digit = 0; digit < 10; digit++) {
                dp[length][digit] = 0;
                for (int move : moves[digit]) {
                    dp[length][digit] += dp[length - 1][move];
                }
            }
        }

        // Sum all sequences of length n
        long totalCount = 0;
        for (int digit = 0; digit < 10; digit++) {
            totalCount += dp[n][digit];
        }

        return totalCount;
    }
}
