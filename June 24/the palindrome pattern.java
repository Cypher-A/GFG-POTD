class Solution {
    public String pattern(int[][] arr) {
        int n = arr.length;

        // Check for palindrome rows
        for (int i = 0; i < n; i++) {
            if (isPalindrome(arr[i])) {
                return i + " R";
            }
        }

        // Check for palindrome columns
        for (int j = 0; j < n; j++) {
            if (isPalindrome(getColumn(arr, j))) {
                return j + " C";
            }
        }

        // If no palindromes found
        return "-1";
    }

    // Helper method to check if an array is a palindrome
    private boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Helper method to extract a column from the matrix
    private int[] getColumn(int[][] arr, int colIndex) {
        int[] column = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            column[i] = arr[i][colIndex];
        }
        return column;
    }
}
