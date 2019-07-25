package JavaAdvanced.MultidimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillTheMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(", ");
        int matrixSize = Integer.parseInt(input[0]);
        char matrixType = input[1].charAt(0);
        int [][] matrix = buildTheMatrix(matrixSize, matrixType);

        for (int i = 0; i < matrixSize; i++) {
            for (int k = 0; k < matrixSize; k++){
                System.out.println(matrix[i][k]+ " ");
            }
            System.out.println();
        }
    }
}
