class Solution {
    
    public static String oddEven(String s) {
        int[] freq = new int[26];
        
        // Step 1: Count the frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int x = 0, y = 0;
        
        // Step 2: Classify and count based on frequency and alphabet position
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                int position = i + 1;
                int frequency = freq[i];
                
                if (position % 2 == 0 && frequency % 2 == 0) {
                    x++;
                } else if (position % 2 == 1 && frequency % 2 == 1) {
                    y++;
                }
            }
        }
        
        // Step 3: Determine if the sum of x and y is even or odd
        int sum = x + y;
        if (sum % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(oddEven("abbbcc"));  // Output: ODD
        System.out.println(oddEven("nobitaa")); // Output: EVEN
    }
}
