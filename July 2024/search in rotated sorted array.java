class Solution {
    int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If the element is found at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If the left half is sorted
            if (arr[low] <= arr[mid]) {
                // Check if the key lies in the left half
                if (arr[low] <= key && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // If the right half is sorted
            else {
                // Check if the key lies in the right half
                if (arr[mid] < key && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        // If the element is not found
        return -1;
    }
}
