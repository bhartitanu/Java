public class Solution3 {
    // Average of 3 nos
    public static int avg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    // check if a no is even or not
    public static boolean isEven(int n) {
        boolean iseven = false;
        System.out.print(n + " is even number:");
        if (n % 2 == 0) {
            iseven = true;
        }
        return iseven;
    }

    // check if a number is palindrome(12321)
    public static boolean isPalindrome(int n) {
        int palindrome = n;// copy data
        int revrse = 0;
        while (palindrome != 0) {
            int rem = palindrome % 10;
            revrse = rem + revrse * 10;
            palindrome /= 10;
        }
        // check if reverse =original
        if (n == revrse) {
            return true;
        } else {
            return false;
        }
    }

    // sum of digits in any integer
    public static int digitSum(int num) {
        int sum = 0, lg;
        while (num > 0) {
            lg = num % 10;
            sum = sum + lg;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // int average = avg(33, 35, 34);
        // System.out.println("the average of 3 nos = " + average);

        // int n = 1961;
        // boolean result = isEven(n);
        // System.out.print(result);

        // int n = 12099021;
        // boolean res = isPalindrome(n);
        // System.out.println(n + " is a palindrome :" + res);

        int n = 63;
        int res = digitSum(n);
        System.out.println("the sum of digits of " + n + "is :" + res);
    }
}
