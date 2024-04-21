class Solution {
    public static int threeWayPartition(int array[], int a, int b) {
        int n = array.length;
        int start = 0;
        int end = n - 1;
        int i = 0;
        
        while (i <= end) {
            if (array[i] < a) {
                swap(array, i, start);
                i++;
                start++;
            } else if (array[i] > b) {
                swap(array, i, end);
                end--;
            } else {
                i++;
            }
        }
        
        return 1; // indicates successful modification
    }
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
