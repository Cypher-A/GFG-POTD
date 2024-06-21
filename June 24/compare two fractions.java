class Solution {

    String compareFrac(String str) {
        // Split the input string into two fractions
        String[] fractions = str.split(", ");
        
        // Split each fraction into numerator and denominator
        String[] frac1 = fractions[0].split("/");
        String[] frac2 = fractions[1].split("/");
        
        // Parse numerators and denominators
        int a = Integer.parseInt(frac1[0]);
        int b = Integer.parseInt(frac1[1]);
        int c = Integer.parseInt(frac2[0]);
        int d = Integer.parseInt(frac2[1]);
        
        // Calculate cross multiplication to avoid precision issues with floating point arithmetic
        int lhs = a * d; // left-hand side of comparison (a/b)
        int rhs = c * b; // right-hand side of comparison (c/d)
        
        // Compare the two cross multiplied results
        if (lhs > rhs) {
            return fractions[0]; // a/b is greater
        } else if (lhs < rhs) {
            return fractions[1]; // c/d is greater
        } else {
            return "equal"; // both fractions are equal
        }
    }
}
