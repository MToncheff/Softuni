package JavaAdvanced.MultidimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixOfPalindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[input[0]][input[1]];

        for (int cow = 0; cow < matrix.length; cow++) {
            for (int row = 0; row < matrix[cow].length; row++) {
                matrix[cow][row] = (char) (97 + cow) + "" + (char) (97 + cow + row) + "" + (char) (97 + cow) + "";
                System.out.print(matrix[cow][row] + " ");
            }
            System.out.println();
        }
    }
}
