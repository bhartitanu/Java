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

    public static float get_shortest_path(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            int dir = s.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            } // north
            else if (dir == 'N') {
                y++;
            } // east
            else if (dir == 'E') {
                x++;
            } // west
            else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
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

        // String s = "raceacar";
        // System.out.println(check_palindrome(s));

        String path = "EWNSSNNNN";
        System.out.println(get_shortest_path(path));

    }
}