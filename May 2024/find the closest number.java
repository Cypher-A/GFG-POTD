class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        
            int l=0,h=n-1;
        while(l<h && h-l>1){
            int m = (l+h)/2;
            if(arr[m]==k) return k;
            if(arr[m]>k) h=m;
            if(arr[m]<k) l=m;
        }
        return Math.abs(arr[l]-k)<Math.abs(arr[h]-k)?arr[l]:arr[h];
    }
}
