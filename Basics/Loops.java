import java.util.Scanner;

public class Loops {
    public static void main(String ags[]) {
        // while loop
        // Print number from 1 to 5
        // int n = 1;
        // while (n <= 5) {
        // System.out.print(n + " ");
        // n++;
        // }
        // System.out.println();

        // print sum of first n natural number
        // int sum = 0;
        // int i = 1;
        // while (i <= 15) {
        // sum += i;
        // i++;
        // }
        // System.out.print(sum);

        // for Loop
        // Print Square Pattern
        // for (int i = 1; i <= 4; i++) {
        // System.out.println("****");
        // }

        // Print reverse of a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n == 2) {
            System.out.println(n + " is Prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n)/* n-1 */; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is not a Prime");
            }
        }

    }
}
