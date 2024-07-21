class Solution {
    public long findMaxProduct(List<Integer> arr) {
        int n = arr.size();
        if (n == 1) {
            // Only 1 element in the array.
            return arr.get(0);
        }

        long ans = 1;
        int mod = 1000000007;
        int id = -1;
        int minElement = 0;
        int zeroCount = 0;
        int negCount = 0;

        for (int i = 0; i < n; i++) {
            int num = arr.get(i);
            if (num == 0) {
                // Counting number of zeros.
                zeroCount++;
            } else if (num < 0) {
                // Counting number of negative numbers.
                negCount++;
                if (id == -1 || num > minElement) {
                    // Storing the index of negative element having least magnitude.
                    id = i;
                    minElement = num;
                }
            }
        }

        if (zeroCount == n) {
            // If there are all zeros.
            return 0;
        }

        if (negCount == 1 && zeroCount == n - 1) {
            // If all elements are zero except one negative element, then return 0.
            return 0;
        }

        for (int i = 0; i < n; i++) {
            int num = arr.get(i);
            if (num == 0) {
                continue;
            }
            if (negCount % 2 == 1 && i == id) {
                // Removing the negative element having least magnitude.
                continue;
            }
            ans = ((ans * num) % mod + mod) % mod;
        }

        return ans;
    }
}
