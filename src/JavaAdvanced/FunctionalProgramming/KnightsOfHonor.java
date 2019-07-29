package JavaAdvanced.FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) throws IOException {
        Consumer<String> stringNames = name -> System.out.printf("Sir %s%n", name);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(bufferedReader.readLine().split("\\s+")).forEach(stringNames);


    }
}
