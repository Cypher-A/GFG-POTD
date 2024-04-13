class Solution {
    static Long reversedBits(Long x) {
        Long reversed = 0L;
        
        for (int i = 0; i < 32; i++) {
            if ((x & (1L << i)) != 0) {
                reversed |= (1L << (31 - i));
            }
        }
        
        return reversed;
    }
}