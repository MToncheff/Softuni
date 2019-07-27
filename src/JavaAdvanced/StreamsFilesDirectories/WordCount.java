package JavaAdvanced.StreamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Path inputText = Paths.get("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\words.txt");
        Path repeatedWords = Paths.get("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\text.txt");
        File outputText = new File("result.txt");
        PrintWriter out = (new PrintWriter(new FileWriter(outputText)));

        Scanner input = new Scanner(inputText);
        while (input.hasNext()) {
            String word  = input.next();
            System.out.println(word);
           //vkarvam toq while loop v try et e dolu za da comparena, vij koda na countcharacterstype
        }
      /*  try (BufferedReader reader = Files.newBufferedReader(inputText)) {
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null){
                String[] words = line.split(" ");
                System.out.println(words);
            }

        } catch (
                IOException e) {
            e.printStackTrace();

        }*/

    }
}
