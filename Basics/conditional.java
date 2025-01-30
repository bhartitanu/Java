import java.util.*;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter age ");
        // int age = sc.nextInt();
        // if (age < 18) {
        // System.out.println("Adult :Can drive and Vote");
        // } else {
        // System.out.println("Not Adult);
        // }

        // Find largest of 2
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("A is greater than B");
        // } else {
        // System.out.println("B is grater than a ");
        // }

        // Print even or odd
        // if (a % 2 == 0) {
        // System.out.println("number is even");
        // } else {
        // System.out.println("Number is odd");
        // }

        // Income Tax Calculator
        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000) {
        // tax = 0;
        // } else if ((income >= 500000) && (income < 1000000)) {
        // tax = (int) (income * 0.2);
        // } else {
        // tax = (int) (income * 0.3);
        // }
        // System.out.println(" Tax=" + tax);
        // System.out.println("Income with tax=" + (int) (income + tax));

        // Find Greatest of Three
        // System.out.println("Enter the value of x,y,z:-");
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int z = sc.nextInt();
        // if (x > y && x > z) {
        // System.out.println("x is largest");
        // } else if (y > z) {
        // System.out.println("y is largest");
        // } else {
        // System.out.println("z is largest");
        // }

        // ternery operator
        // int marks = 18;
        // String result = (marks >= 33) ? "Pass" : "Fail";
        // System.out.println(result);

        // Calculator
        System.out.println("Enter a and b:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator:-");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Addition of a and b:-" + (a + b));
                break;
            case '-':
                System.out.println("subtraction of a and b:-" + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of a and b:-" + (a * b));
                break;
            case '/':
                System.out.println("Division of a and b:-" + (a / b));
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}