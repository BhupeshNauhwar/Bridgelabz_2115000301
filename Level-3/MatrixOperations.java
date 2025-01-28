import java.util.Random;
class MatrixOperations {
    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat2[0].length, common = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = generateMatrix(2, 2);
        int[][] mat2 = generateMatrix(2, 2);

        System.out.println("Matrix 1:");
        displayMatrix(mat1);

        System.out.println("Matrix 2:");
        displayMatrix(mat2);

        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(mat1, mat2));

        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(mat1, mat2));

        System.out.println("Matrix Multiplication:");
        displayMatrix(multiplyMatrices(mat1, mat2));
    }
}
