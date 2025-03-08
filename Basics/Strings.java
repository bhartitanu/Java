import java.util.Scanner;

public class Strings {
    public static boolean check_palindrome(String s) {
        int n = s.length();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "tanu";
        // System.out.println(str);
        Scanner sc = new Scanner(System.in);
        // String firstname = sc.next();
        // String lastname = sc.next();
        sc.close();
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname);

        String s = "raceacar";
        System.out.println(check_palindrome(s));

    }
}