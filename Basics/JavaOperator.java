import java.util.*;

public class JavaOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a");
        int a = sc.nextInt();
        System.out.println("Enter a number b");
        int b = sc.nextInt();

        // Airthmatic Operator
        // System.out.println("sum=" + (a + b));
        // System.out.println("Subtract=" + (a - b));
        // System.out.println("Multiply=" + (a * b));
        // System.out.println("Division=" + (a / b));
        // System.out.println("Remainder=" + (a % b));

        // Unary Operator
        // System.out.println("a=" + a);
        // System.out.println("a++=" + (a++));
        // System.out.println("++a=" + (++a));
        // System.out.println("--a=" + (--a));
        // System.out.println("a--=" + (a--));

        // Relational Operator
        // System.out.println("a>b=" + (a > b));
        // System.out.println("a==b=" + (a == b));
        // System.out.println("a<b=" + (a < b));
        // System.out.println("a>=b=" + (a >= b));

        // Logical Operator
        // System.out.println("AND=" + ((a > b) && (a == b)));
        // System.out.println("OR=" + ((a > b) || (a == b)));
        // System.out.println("NOT=" + (!(a > b) || (a == b)));

        // Assignment Operator
        // System.out.println("a+=3:- " + (a += 3)); // a=a+3
        // System.out.println("a-=2:- " + (a -= 2)); // a=a-2
        // System.out.println("b=a:- " + (b = a)); // b=a

        // Evaluation of expression
        int exp1 = (a * b / a);
        int exp2 = (a * (b / a));
        System.out.print(exp1 + ",");
        System.out.print(exp2);
    }
}