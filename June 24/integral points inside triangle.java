class Solution {
    long InternalCount(long[] p, long[] q, long[] r) {
        // Calculate the area of the triangle using the determinant method
        long area = Math.abs(p[0] * (q[1] - r[1]) + q[0] * (r[1] - p[1]) + r[0] * (p[1] - q[1]));
        
        // Calculate the boundary points using GCD
        long b = gcd(Math.abs(p[0] - q[0]), Math.abs(p[1] - q[1])) +
                 gcd(Math.abs(q[0] - r[0]), Math.abs(q[1] - r[1])) +
                 gcd(Math.abs(r[0] - p[0]), Math.abs(r[1] - p[1]));
        
        // Using Pick's theorem: I = (Area - B / 2 + 1)
        long I = (area - b) / 2 + 1;
        
        return I;
    }
    
    // Helper method to calculate GCD
    long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
