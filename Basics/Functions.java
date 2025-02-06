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

    // Call by value
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Product
    public static int Multiply(int x, int y) {
        int prod = x * y;
        return prod;
    }

    // factorial
    public static int Fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // binomial coeficient
    public static int bcoe(int n, int r) {
        int res = Fact(n) / (Fact(r) * (Fact(n - r)));
        return res;
    }

    // fuction overloading
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // printhello();
        // printhello();

        // sum(2, 3);
        // sum(2, 2);

        // int result = calculateSum();
        // System.out.println(result);

        // int a = 6;
        // int b = 7;
        // // same value pass as agrument
        // swap(a, b);
        // System.out.println("Value of a and b after swapping=" + a + "," + b);

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int product = Multiply(x, y);
        // System.out.println("Multiply of " + x + " and " + y + "= " + product);
        // int prod = Multiply(2, 3);
        // System.out.println("Multiply=" + prod);

        // System.out.println(Fact(7));
        // System.out.println(bcoe(5, 3));

        // Function overloading
        System.out.println(Sum(3, 5));
        System.out.println(Sum(4.2f, 0.7f));
        System.out.println(Sum(4, 0, 8));

    }
}