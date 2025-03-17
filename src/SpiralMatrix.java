import java.util.Scanner;

public class SpiralMatrix {
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse from top to bottom along the leftmost column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;

            // Traverse from left to right along the bottom row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;

            // Traverse from bottom to top along the rightmost column (if still within boundaries)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            }

            // Traverse from right to left along the top row (if still within boundaries)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Rows and Columns
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        // Input: 2D Matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print spiral order
        printSpiral(matrix, rows, cols);

        scanner.close();
    }
}
