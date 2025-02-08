import java.util.*;

public class HalfPyramid {
    public static void HalfNumberPyramid(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    public static void CharacterHalfPyramid(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    // Inverted and Rotated HalfPyramid
    public static void inv_rot_hp(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // inverted half pyramid with number
    public static void inv_hlfpyr_num(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();

        // Half Number Pyramid
        // HalfNumberPyramid(n);

        // Character Half Pyramid
        // CharacterHalfPyramid(n);

        // Half pyramid-Invertd and rotated
        // inv_rot_hp(n);

        // Inverted half pyramid with num
        inv_hlfpyr_num(n);
    }
}