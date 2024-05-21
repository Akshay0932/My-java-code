                     ///AlternatePrimeNumbers
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


public class Alterprime {
    public static void main(String[] args) {
        int limit = 100; // Example limit up to which we want to find alternate prime numbers
        printAlternatePrimes(limit);
    }

    public static void printAlternatePrimes(int limit) {
        int count = 0; // Counter to track alternate primes

        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                count++;
                // Print the number if it's an alternate prime (i.e., if the count is odd)
                if (count % 2 != 0) {
                    System.out.println(num);
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
