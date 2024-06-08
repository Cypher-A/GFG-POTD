class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        int left = 0;
        int right = n - 2; // arr2 has n-1 elements
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr1[mid] == arr2[mid]) {
                // Extra element is in the right half
                left = mid + 1;
            } else {
                // Extra element is in the left half or at mid
                right = mid - 1;
            }
        }
        
        // Left pointer should be at the extra element's index
        return left;
    }
}
