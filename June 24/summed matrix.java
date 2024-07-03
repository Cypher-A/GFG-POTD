class Solution {
    static long sumMatrix(long n, long q) {
        long ans = q-1;
        if(n < q){
            ans = n - (q - n) + 1;
        }
        return ans < 0 ? 0 : ans;
    }
}
