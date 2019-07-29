package JavaAdvanced.FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        Function<Integer[],Integer> smallestNumber = (numbers) -> { return Arrays.stream(numbers).min(Integer::compareTo).orElse(Integer.MIN_VALUE);};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashSet<Integer> numbers = Arrays.stream(bufferedReader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        Integer[] nums = numbers.stream().toArray(Integer[]::new);

        System.out.println(smallestNumber.apply(nums));

    }

}
