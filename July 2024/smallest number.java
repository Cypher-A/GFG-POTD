class Solution {
    public String smallestNumber(int s, int d) {
        int m = (int) Math.pow(10, (d-1));
        for(int i = m; i < m*10; i++){
            int sum = 0, m2 = i;
            while (m2 != 0){
                sum += (m2 % 10);
                m2 = m2 / 10;
            }
            if(sum == s){
                return String.valueOf(i);
            }
        }
        return "-1";
    }
}
