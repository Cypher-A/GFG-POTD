class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x)
    {
        // code here
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            int diff = Integer.MAX_VALUE;
            int val = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != -1 && arr[j] != x) {
                    if (Math.abs(x - arr[j]) <= diff) {
                        diff = Math.abs(x - arr[j]);
                        val = j;
                    }
                }
            }

            ans[i] = arr[val];
            arr[val] = -1;
        }

        return ans;
    }
}
