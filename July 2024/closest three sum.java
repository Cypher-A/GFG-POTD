class Solution {
    static int threeSumClosest(int[] array, int target) {
        Arrays.sort(array);
        int closestSum = Integer.MIN_VALUE; // Initialize to the smallest integer value

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];

                if (currentSum == target) {
                    return currentSum;
                }

                if (Math.abs(target - currentSum) < Math.abs(target - closestSum) || 
                    (Math.abs(target - currentSum) == Math.abs(target - closestSum) && currentSum > closestSum)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }

}
