package JavaAdvanced.StreamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        Path inputText = Paths.get("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\input.txt");
        File outputText = new File("output.txt");
        PrintWriter out = (new PrintWriter(new FileWriter(outputText)));

        try (BufferedReader reader = Files.newBufferedReader(inputText)) {
            int counter = 0;
            int consonants = 0;
            int punctuations = 0;
            String line = reader.readLine();
            while (line !=null)  {
                char[] charArr = line.toCharArray();
                for (char c : charArr) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        counter++;
                    if (c == '!' || c == ',' || c == '.' || c == '?')
                        punctuations++;
                    if (c != ' ')
                        consonants ++;
                }

                line = reader.readLine();


            }
            out.println("Vowels: " + counter);
            out.println("Consonants: " + ((consonants-counter)-punctuations));
            out.println("Punctuations: " + punctuations);
            out.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }

    }
}
