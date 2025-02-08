import java.util.*;

public class Triangles {
    // traingle star pattern
    public static void tri_star(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Inverted triangle
    public static void inv_tri(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= (n - r) + 1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Flyod's Traingle
    public static void flyod_tri(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // 0-1 triangle
    public static void tri_0_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // if i+j==even print 1 and for odd print 0
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();

        // Tringle Star Pattern
        // tri_star(n);

        // Inverted Triangle
        // inv_tri(n);

        // flyod Triangle
        // flyod_tri(n);

        // 0-1 traingle
        tri_0_1(n);
    }
}