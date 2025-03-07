public class Solution6 {

    // count the num of 7's in 2d array
    public static void count7(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.print("no of 7s are: " + count);
    }

    // Print the sum of 2nd row elements
    public static void Second_row_sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[1][i];
        }
        System.out.println("The sum of second row " + sum);
    }

    // Transpose of matrix
    public static void transpose(int matrix[][]) {
        int transpose[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public static void printmatrix(int matrix[][]) {
    // }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 5, 0 },
                { 6, 0, 4 },
                { 3, 1, 7 } };
        // count7(matrix);
        // Second_row_sum(matrix);
        transpose(matrix);
        // printmatrix(matrix);
    }

}