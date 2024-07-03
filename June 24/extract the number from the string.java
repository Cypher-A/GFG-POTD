class Solution {
    public long ExtractNumber(String sentence) {
        String[] tokens = sentence.split(" ");
        long maxNumber = -1;
        
        for (String token : tokens) {
            if (isNumber(token) && !token.contains("9")) {
                long num = Long.parseLong(token);
                if (num > maxNumber) {
                    maxNumber = num;
                }
            }
        }
        
        return maxNumber;
    }
    
    private boolean isNumber(String token) {
        for (char c : token.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
