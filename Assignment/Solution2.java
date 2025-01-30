import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print sum of even and odd
        // System.out.print("Enter a number ");
        // int n = sc.nextInt();
        // int eSum = 0;
        // int oSum = 0;
        // if (n % 2 == 0) {
        // System.out.println("The number is even");
        // for (int i = 1; i <= n; i++) {
        // eSum += i;
        // }
        // System.out.println("The sum = " + eSum);
        // } else {
        // System.out.println("The number is odd");
        // for (int i = 1; i <= n; i++) {
        // oSum += i;
        // }
        // System.out.println("The sum =" + oSum);
        // }

        // Factorial of num
        // int n = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.println("The Factorial of n is " + fact);

        // Multiplication of n
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }

    }

}
