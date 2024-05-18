class Solution {
    public int findPeakElement(List<Integer> a) {
        int left = 0;
        int right = a.size() - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (a.get(mid) < a.get(mid + 1)) {
                // Peak is in the right half
                left = mid + 1;
            } else {
                // Peak is in the left half or at mid
                right = mid;
            }
        }
        
        // When left == right, we have found the peak element
        return a.get(left);
    }
}

