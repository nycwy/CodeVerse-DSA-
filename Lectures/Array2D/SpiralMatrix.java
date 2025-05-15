public class SpiralMatrix {
    public static void spiralMatrix(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Traverse the matrix in spiral order
        while (top <= bottom && left <= right) {

            // Traverse from Left to Right
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // Traverse from Top to Bottom
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // Traverse from Right to Left (only if there's a remaining row)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // Traverse from Bottom to Top (only if there's a remaining column)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5, 6},
            {20, 21, 22, 23, 24, 7},
            {19, 32, 33, 34, 25, 8},
            {18, 31, 36, 35, 26, 9},
            {17, 30, 29, 28, 27, 10},
            {16, 15, 14, 13, 12, 11}
        };
        // Test with a single row:
        // int[][] matrix = { {1, 2, 3, 4, 5} };
        spiralMatrix(matrix);
    }
}
