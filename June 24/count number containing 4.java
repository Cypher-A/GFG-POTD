class Solution {
    public static int countNumberswith4(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (containsFour(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean containsFour(int number) {
        // Convert the number to a string and check if it contains '4'
        return Integer.toString(number).contains("4");
    }

}
