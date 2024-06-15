class Solution {
    public static boolean armstrongNumber(int n) {
        // Extract the digits
        int originalNumber = n;
        int digit1 = n % 10;
        n /= 10;
        int digit2 = n % 10;
        n /= 10;
        int digit3 = n % 10;

        // Calculate the sum of the cubes of the digits
        int sumOfCubes = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);

        // Compare with the original number
        return sumOfCubes == originalNumber;
    }

}
