package JavaOOP.WorkingWithAbstraction.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        System.out.println(input + ":");
        Arrays.stream(CardSuits.values()).forEach(System.out::println);
    }
}