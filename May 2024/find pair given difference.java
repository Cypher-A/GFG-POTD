class Solution {
    public static int findPair(int n, int x, int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Initialize two pointers
        int left = 0;
        int right = 1;
        
        // Step 3: Traverse the array with two pointers
        while (left < n && right < n) {
            // Calculate the difference
            int diff = arr[right] - arr[left];
            
            // If the difference is equal to x, return 1
            if (diff == x && left != right) {
                return 1;
            }
            // If the difference is less than x, move the right pointer to the right
            else if (diff < x) {
                right++;
            }
            // If the difference is greater than x, move the left pointer to the right
            else {
                left++;
            }
        }
        
        // If no such pair is found, return -1
        return -1;
    }
}
