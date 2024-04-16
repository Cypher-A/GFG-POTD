class Solution {
    public int minimizeDifference(int n, int k, int[] arr) {

        int[] postMax = new int[n];
        int[] postMin = new int[n];

        postMin[n - 1] = arr[n - 1];
        postMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; --i) {
            postMax[i] = Math.max(arr[i], postMax[i + 1]);
            postMin[i] = Math.min(arr[i], postMin[i + 1]);
        }

        int minDiff = postMax[k] - postMin[k];

        int pMin = arr[0];
        int pMax = arr[0];

        for (int i = 1; i < n - k; ++i) {
            int currMin = Math.max(pMax, postMax[i + k]) - Math.min(pMin, postMin[i + k]);
            minDiff = Math.min(minDiff, currMin);
            pMax = Math.max(arr[i], pMax);
            pMin = Math.min(arr[i], pMin);
        }

        minDiff = Math.min(minDiff, pMax - pMin);

        return minDiff;
    }
}
