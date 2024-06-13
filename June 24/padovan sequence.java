class Solution {

    // Method to compute nth Padovan number modulo 10^9+7
    public int padovanSequence(int n) {
        final int MOD = 1000000007;

        // Base cases
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }

        // Initializing the first three values of the Padovan sequence
        int p0 = 1, p1 = 1, p2 = 1, p3 = 0;

        // Calculating Padovan numbers iteratively
        for (int i = 3; i <= n; i++) {
            p3 = (p0 + p1) % MOD; // P(n) = P(n-2) + P(n-3) % MOD
            p0 = p1;
            p1 = p2;
            p2 = p3;
        }

        return p3;
    }

}

