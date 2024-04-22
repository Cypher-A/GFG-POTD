class Solution{
    public static int grayToBinary(int n) {
        int b=0;
      
        for(n=n;n>0;n=n>>1)
          b^=n;
        return b;
    }
}
