class Solution {

    public static int swapNibbles(int n) {
        // Extract high nibble and shift it to the right by 4 bits
        int highNibble = (n & 0xF0) >> 4;
        // Extract low nibble
        int lowNibble = (n & 0x0F);
        // Swap nibbles and combine
        int result = (lowNibble << 4) | highNibble;
        return result;
    }

}

