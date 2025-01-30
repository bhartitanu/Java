import java.util.*;

public class JavaMains {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int n = sc.nextInt();
        // int r = sc.nextInt();

        // System.out.print("Output of System");
        // System.out.println("Output ");

        // System.out.println("*****");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // Sum of two no
        // int sum = a + n;
        // System.out.println(sum);

        // Type Conversion
        // float area = 3.14f * (r * r);
        // System.out.println(area);

        // type Casting
        // int area = (int) 3.14f * (r * r);
        // System.out.println(area);

        // type promotion
        short s = sc.nextShort();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        double result = s + a + f + d;
        System.out.println(result);
    }
}
