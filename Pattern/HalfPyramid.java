import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int n = sc.nextInt();

        // Half Number Pyramid
        // for (int r = 1; r <= 4; r++) {
        // for (int c = 1; c <= r; c++) {
        // System.out.print(c);
        // }
        // System.out.println("");
        // }

        // Character Half Pyramid
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}