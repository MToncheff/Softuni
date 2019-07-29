package JavaAdvanced.StreamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class WordCount {
    private static final String inputText =("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\words.txt");
    private static final String repeatedWords = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\text.txt";
    private static final String outputText = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\results.txt";
    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputText));
        PrintWriter printWriter = new PrintWriter(outputText);

        List<String> searchedWords = Arrays.asList(bufferedReader.readLine().split("\\s+"));

        LinkedHashMap<String, Long> words = new LinkedHashMap<>();

        bufferedReader = new BufferedReader(new FileReader(repeatedWords));
        String line = bufferedReader.readLine();

        while (line != null) {
            String[] currentWords = line.split("\\s+");

            for (int i = 0; i < currentWords.length; i++) {
                String currentWord = currentWords[i];

                if (searchedWords.contains(currentWord)) {
                    if (!words.containsKey(currentWord)) {
                        words.put(currentWord, 1L);
                    } else {
                        words.put(currentWord, words.get(currentWord) + 1);
                    }
                }
            }
            line = bufferedReader.readLine();
        }
        words.entrySet().stream().sorted((frequency1, frequency2) -> {
            return frequency2.getValue().compareTo(frequency1.getValue());
        }).forEach(entry -> {
            printWriter.println(String.format("%s - %s", entry.getKey(), entry.getValue()));
        });


        }
    }
