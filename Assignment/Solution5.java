//sorting for decreasing order

public class Solution5 {

    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
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
                if (a[minPos] < a[j]) {
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
            while (prevIndex >= 0 && a[prevIndex] < curr) {
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
        int j = a.length - 1;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j] = i;
                j--;
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
        int a[] = { 3, 0, 6, 2, 1, 6, 3, 8, 8, 3, 1 };

        // bubble_sort(a);
        // System.out.print("Array after bubble sort : ");
        // printArray(a);

        // SelectionSort(a);
        // System.out.print("Array after Selection sort : ");
        // printArray(a);

        // insertionSort(a);
        // System.out.print("Array after Insertion sort : ");
        // printArray(a);

        countingsort(a);
        System.out.print("Array after counting sort : ");
        printArray(a);

    }
}
