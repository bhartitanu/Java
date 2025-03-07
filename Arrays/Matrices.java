import java.util.*;

public class Matrices {
    public static void Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("The element found at (" + i + "," + j + ")");
                }
            }
        }
    }

    public static void spiralMatrix(int matrix[][]) {
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // top
            for (int j = colStart; j <= colEnd; j++) {
                System.out.print(matrix[rowStart][j] + " ");
            }
            // right
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            // bottom
            for (int j = colEnd - 1; j >= colStart; j--) {
                System.out.print(matrix[rowEnd][j] + " ");
            }
            // left
            for (int i = rowEnd - 1; i >= rowStart + 1; i--) {
                System.out.print(matrix[i][colStart] + " ");
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        System.out.println();
    }

    public static int diagonal_sum(int matrix[][]) {
        int sum = 0;

        // brute force -O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // Linear approach-O(n)
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix[0].length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static boolean StaircaseSearch(int matrix[][], int key) {

        // ROW-WISE
        // int row = 0;
        // int col = matrix[0].length - 1;
        // while (row <= matrix.length && col >= 0) {
        // if (matrix[row][col] == key) {
        // System.out.println("Element found at index (" + (row + 1) + "," + (col + 1) +
        // ")");
        // return true;
        // } else if (matrix[row][col] > key) {
        // col--;
        // } else {
        // row++;
        // }
        // }
        // System.out.println("key not found ");
        // return false;

        // COLUMN-WISE
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col <= matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Element found (" + (row + 1) + "," + (col + 1) + ")");
                return true;
            } else if (matrix[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String args[]) {
        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;

        // System.out.println("enter the elements of the matrix:");
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        sc.close();

        // System.out.println("The matrix is : ");
        // // print matrix
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Search(matrix, 3);

        int Matrix[][] = { { 1, 2, 3, 4 },
                { 6, 7, 8, 9 },
                { 11, 12, 13, 14 },
                { 16, 17, 18, 19 }
        };

        // System.out.println(diagonal_sum(Matrix));
        System.out.println(StaircaseSearch(Matrix, 19));
    }
}