public class bin_dec_conversion {
    public static void bin_to_dec(int num) {
        int dec = 0, pow = 0, lastDigit;
        int n = num;
        while (n > 0) {
            lastDigit = n % 10;
            dec = dec + (lastDigit * (int) (Math.pow(2, pow)));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of " + num + "(binary num)= " + dec);
    }

    public static void dec_to_bin(int num) {
        int n = num;
        int pow = 0, bin = 0, rem;
        while (n > 0) {
            rem = n % 2;
            bin = bin + rem * (int) (Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("The binary of " + num + " is= " + bin);
    }

    public static void main(String[] args) {
        // bin_to_dec(1010);
        dec_to_bin(16);
    }
}
