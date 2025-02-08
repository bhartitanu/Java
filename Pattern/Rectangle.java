import java.util.*;

public class Rectangle {
    public static void SolidRectangle(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowRectangle(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                if (i == 1 || i == length || j == 1 || j == breadth) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        SolidRectangle(l, b);
        System.out.println("");
        HollowRectangle(l, b);
    }

}