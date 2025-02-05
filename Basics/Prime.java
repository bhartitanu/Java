public class Prime {
    // Check if a number is prime
    public static boolean isPrimefxn(int num) {
        // corner case
        if (num == 2) {
            return true;
        }
        // if n>=2
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check if a number is prime-more optimised
    public static boolean isPrime(int num) {
        // corner case
        if (num == 2) {
            return true;
        }
        // if n>=2
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Print Prime in Range
    public static void printprime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nThe no of Primes are=" + count);
    }

    public static void main(String args[]) {
        // System.out.println(isPrimefxn(21));
        // System.out.println(isPrime(112));
        printprime(500);

    }
}
