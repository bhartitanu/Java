public class subarray {
    // Subarrays
    public static void printSubarray(int a[]) {
        int ts = 0;
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + " ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of subarray are: " + ts);
    }

    // Pairs In Array
    public static void pairInArray(int a[]) {
        int totalPairs = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs are: " + totalPairs);
    }

    public static void main(String args[]) {
        int a[] = { 2, 3, 4, 1, 0 };

        // printing pairs
        pairInArray(a);
        //
        // printSubarray(a);
    }
}
