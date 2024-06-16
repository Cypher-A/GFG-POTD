class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (n < 3) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        
        // Step 1: Generate all prime numbers up to n using Sieve of Eratosthenes
        boolean[] isPrime = sieveOfEratosthenes(n);
        
        // Step 2: Find the pair of prime numbers
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                result.add(i);
                result.add(n - i);
                return result;
            }
        }
        
        result.add(-1);
        result.add(-1);
        return result;
    }
    
    // Helper function to perform Sieve of Eratosthenes
    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        return isPrime;
    }

}

