class Solution {
    public long pairAndSum(int n, long[] arr) {
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            long c = 0;
            long t = 1 << i;
            for (int j = 0; j < n; j++) {
                if ((t & arr[j]) != 0) {
                    c++;
                }
            }
            ans += (c * (c - 1) / 2) * (t);
        }
        return ans;
    }
}

