import java.util.Scanner;

public class Solution1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Input-based

        // Question1:- Average of 3 no
        // System.out.println("Enter a,b,c:-");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (int) (a + b + c) / 3;
        // System.out.print("The average of a,b,c:-");
        // System.out.print(avg);

        // Question2:- Area of Square
        // System.out.println("Enter the side of Square");
        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println("Area :-" + area);

        // Q3:-Find Cost
        // System.out.println("Enter the Costs:-");
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // double totalCost = pencil + pen + eraser;
        // System.out.println("Total bill without GST:-" + totalCost);
        // double cost_with_GST = totalCost + totalCost * 0.18;
        // System.out.println("Total bill with GST:-" + cost_with_GST);

        // Conditional statements
        // Q-4:-check wheather a no is positive or not
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // if (n < 0) {
        // System.out.println("The number is negative");
        // } else if (n == 0) {
        // System.out.println("The number is neither positive nor negtaive");
        // } else {
        // System.out.println("The number is positive");
        // }

        // Q-5:-Print fever
        // double temp = 99.4;
        // String s1 = "You have fever";
        // String s2 = "you don't have fever";
        // String result = (temp > 100) ? s1 : s2;
        // System.out.println(result);

        // Q6:-print week name
        // System.out.print("Enter a number(1-7):-");
        // int n = sc.nextInt();
        // switch (n) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thrusday");
        // break;
        // case 6:
        // System.out.println("Friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("wrong Choice");
        // }

        // Q:-7Leap year
        System.out.print("enter a year:- ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap year");
                } else {
                    System.out.println(year + " is not a Leap year");
                }
            } else {
                System.out.println(year + " is a Leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
