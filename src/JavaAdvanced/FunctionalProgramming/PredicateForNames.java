package JavaAdvanced.FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;


public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer length = Integer.parseInt(bufferedReader.readLine());

        Arrays.stream(bufferedReader.readLine().split("\\s+"))
                .filter(name -> lengthPredicate.test(name, length))
                .forEach(System.out::println);
    }
    private static final BiPredicate<String, Integer> lengthPredicate = (name, length) -> {
        return name.length() <= length;
    };
}
