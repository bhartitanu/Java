import java.util.Scanner;

public class Pyramid {
    // pyramid with number
    public static void NumPyr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Inverted Pyramid
    public static void Inv_pyr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindrome(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pascal's Triangle
    public static void Pascal_tri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + "  ");
                number = number * (i - j) / j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();

        // Number Pyramid
        // NumPyr(n);

        // Inverted Number Pyramid
        // Inv_pyr(n);

        // Palindrome Pattern
        // palindrome(n);

        // Pascal's Triangle
        Pascal_tri(n);
    }

}
