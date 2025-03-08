import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String str = "tanu";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String firstname = sc.next();
        String lastname = sc.next();
        sc.close();
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

    }
}