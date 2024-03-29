package JavaAdvanced.MultidimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillTheMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(", +");
        int matrixSize = Integer.parseInt(input[0]);
        String matrixType = input[1];


        int[][] matrix = new int[matrixSize][matrixSize];

        if (matrixType.equals("A")) {
            buildMatrixWithFirstType(matrix);
        } else {
            buildMatrixWithSecondType(matrix);
        }

        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void buildMatrixWithFirstType(int[][] matrix) {
        int initialValue = 1;

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = initialValue++;
            }
        }
    }

    private static void buildMatrixWithSecondType(int[][] matrix) {
        int initialValue = 1;

        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = initialValue++;
                }

            }
            else {

                        for (int row = matrix.length- 1; row >= 0 ; row--) {
                            matrix[row][col] = initialValue++;
                        }
            }
        }
    }
}