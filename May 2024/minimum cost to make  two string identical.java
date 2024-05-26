class Solution {
    public int lcs(String X, String Y, int m, int n) {
        int[][] L = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;

                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;

                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }

        return L[m][n];
    }

    public int findMinCost(String x, String y, int costX, int costY) {
        // Find LCS of X[] and Y[]
        int m = x.length(), n = y.length();
        int len_LCS = lcs(x, y, m, n);

       
        return costX * (m - len_LCS) + costY * (n - len_LCS);
    }
}

