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

    // Printing the maximum sum subarray using brute force
    public static void MaxSum_Subaray_bf(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += a[k];
                }
                System.out.println(currSum + " ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum among all sum is: " + maxSum);
    }

    // Printing the maximum sum subarray using prefix array
    public static void MaxSum_Subaray_prefix(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[a.length];

        prefix[0] = a[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
            System.out.println(prefix[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                // curent sum using prefix array
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum among all sum is: " + maxSum);
    }

    // Maxsum subarray using kadane's Algorithm
    public static void kadanesAlgo(int a[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 1; i < a.length; i++) {
            cs = Math.max(cs + a[i], a[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Maxium subaray sum is " + ms);
    }

    public static void main(String args[]) {
        int a[] = { -2 - 1, 0, -3, -4, 9, 4, 3, 2 };

        // printing pairs
        // pairInArray(a);
        // Printing the subarrays
        // printSubarray(a);

        // printing the maximum sum using bruteforce
        // MaxSum_Subaray_bf(a);

        // printing the maximum sum using prefix array
        MaxSum_Subaray_prefix(a);

        // Kadane's Algorithm
        kadanesAlgo(a);
    }
}
