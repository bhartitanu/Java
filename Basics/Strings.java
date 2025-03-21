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

    public static void substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        System.out.println(substr);
    }

    public static void largestString(String strs[]) {
        String largest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (largest.compareTo(strs[i]) < 0) {
                largest = strs[i];
            } else {
                continue;
            }
        }
        System.out.println(largest);
    }

    public static String toUppercase(String str) {
        StringBuilder s = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        s.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            } else {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

    public static String compress(String s) {
        String newstr = "";
        for (int i = 0; i < s.length(); i++) {
            Integer count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += s.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }
        return newstr;
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

        // String path = "EWNSSNNNN";
        // System.out.println(get_shortest_path(path));

        // String s = "HelloWorld";
        // substring(s, 5, 10);
        // System.out.println(s.substring(5, 10));

        // Find largest among strings
        // String s[] = { "Surilachandra", "Raj", "sundri" };
        // largestString(s);

        // StringBuilder s = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // s.append(ch);
        // }
        // System.out.println(s);
        // System.out.println(s.length());

        // String s = "hi I am a student ";
        // System.out.println(toUppercase(s));

        String str = "aaattcccccaa";
        System.out.println(compress(str));
    }
}