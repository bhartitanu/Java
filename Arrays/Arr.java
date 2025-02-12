import java.util.*;

public class Arr {
    public static void createArray(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of arrays");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    // Linear Search
    public static void linear_search(int a[], int key) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                index = i;
            } else {
                index = -1;
            }
        }
        if (index == -1) {
            System.out.print("Element not found");
        } else {
            System.out.print("The element is found at index: " + index);
        }
    }

    // Smallest in array
    public static int getSmallest(int a[], int size) {
        int smallest = a[0];
        int largest = a[0];
        for (int i = 0; i < size; i++) {
            if (smallest > a[i]) {
                smallest = a[i];
            }
            if (largest < a[i]) {
                largest = a[i];
            }
        }
        System.out.println("The largest num in array is :" + largest);
        return smallest;
    }

    // Binary search
    public static int binary_search(int a[], int key, int n) {
        Arrays.sort(a, 0, n);
        int start = 0, end = n - 1;
        while (start <= end) {
            // int mid = start + (end - start) / 2;
            int mid = start + (end - start) / 2;
            if (a[mid] == key) {
                return mid;
            }
            if (a[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Reverse the Array
    public static void reverseArray(int a[]) {
        int first = 0;
        int last = a.length - 1;
        while (first < last) {
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }
    }

    public static void printArray(int a[], int size) {
        System.out.print("The elements of arrays :");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int[20];
        // System.out.print("Enter the size of array:- ");
        // int n = sc.nextInt();
        // createArray(arr, n);

        // printArray(arr, n);

        // linear search
        // System.out.print("Enter the element you want to find ");
        // int key = sc.nextInt();
        // linear_search(arr, 4);

        // smallest and largest in array
        // System.out.println("The Smallest in the given array is " + getSmallest(arr,
        // n));

        // Binary Search
        // Arrays.sort(arr);
        // System.out.print("Enter the element you want to find ");
        // int key = sc.nextInt();
        // System.out.println("The index for key is " + binary_search(arr, n, key));

        int arr[] = { 2, 3, 4, 5, 1, 7 };
        // reverse the array
        reverseArray(arr);
        printArray(arr, arr.length);
    }
}