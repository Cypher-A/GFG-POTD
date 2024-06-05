class Solution {
    long findSwapValues(long[] a, int n, long[] b, int m) {
        long sumA = 0;
        long sumB = 0;

        for (int i = 0; i < n; i++) {
            sumA += a[i];
        }

        for (int i = 0; i < m; i++) {
            sumB += b[i];
        }

        long diff = sumA - sumB;

        // If the difference is not even, it's impossible to split the difference in two
        if (diff % 2 != 0) {
            return -1;
        }

        // Half of the difference
        long target = diff / 2;

        // Use a set to store elements of array b for quick lookup
        Set<Long> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(b[i]);
        }

        // Check if there exists an element in a such that a[i] - target exists in b
        for (int i = 0; i < n; i++) {
            if (setB.contains(a[i] - target)) {
                return 1;
            }
        }

        return -1;
    }

}
