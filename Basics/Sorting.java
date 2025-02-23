import java.util.*;

public class Sorting {
    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minPos] > a[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0 && a[prevIndex] > curr) {
                a[prevIndex + 1] = a[prevIndex];
                prevIndex--;
            }
            a[prevIndex + 1] = curr;
        }
    }

    public static void countingsort(int a[]) {
        int largest = Integer.MIN_VALUE;
        // finding largest in all
        for (int i = 0; i < a.length; i++) {
            largest = Math.max(largest, a[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 1, 3, 1, 5, 6, 4 };

        // bubble_sort(a);
        // System.out.print("Array after bubble sort : ");
        // printArray(a);

        // SelectionSort(a);
        // System.out.print("Array after Selection sort : ");
        // printArray(a);

        // insertionSort(a);
        // System.out.print("Array after Insertion sort : ");
        // printArray(a);

        // Arrays.sort(a);
        // printArray(a);

        Arrays.sort(a, 0, 3);
        printArray(a);

        // Integer arr[] = { 2, 5, 1, 4, -4 };
        // Arrays.sort(arr, Collections.reverseOrder());
        // // to print we need to change prinrArray function datatype to Integer object
        // // printArray(arr);

        countingsort(a);
        System.out.print("Array after Counting sort : ");
        printArray(a);

    }
}