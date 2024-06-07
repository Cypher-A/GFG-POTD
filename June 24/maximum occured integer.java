class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        // Create an array of size maxx + 2
        int[] arr = new int[maxx + 2];

        // Increment the start of range and decrement the end+1 of range
        for (int i = 0; i < n; i++) {
            arr[l[i]] += 1;
            arr[r[i] + 1] -= 1;
        }

        // Compute prefix sums to get the actual counts
        int maxOccurred = arr[0];
        int result = 0;
        for (int i = 1; i <= maxx; i++) {
            arr[i] += arr[i - 1];
            if (arr[i] > maxOccurred) {
                maxOccurred = arr[i];
                result = i;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        int n = 4;
        int[] l = {1, 4, 3, 1};
        int[] r = {15, 8, 5, 4};
        int maxx = 15;
        System.out.println(maxOccured(n, l, r, maxx)); // Output should be 4
        
        n = 5;
        l = new int[]{1, 5, 9, 13, 21};
        r = new int[]{15, 8, 12, 20, 30};
        maxx = 30;
        System.out.println(maxOccured(n, l, r, maxx)); // Output should be 5
    }
}

