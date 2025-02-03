import java.util.*;

public class Functions {
    public static void printhello() {
        System.out.println("hello World");
    }

    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static int calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        // printhello();
        // printhello();
        // sum(2, 3);
        // sum(2, 2);
        int result = calculateSum();
        System.out.println(result);
    }
}