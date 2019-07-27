package JavaAdvanced.StreamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LineNumbers {
    public static void main(String[] args) throws IOException {


    Path inputText = Paths.get("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\inputLineNumbers.txt");
    File outputText = new File("output.txt");
    PrintWriter out = (new PrintWriter(new FileWriter(outputText)));
        try (
    BufferedReader reader = Files.newBufferedReader(inputText)) {
            String line = null;
            int counter = 1;
            while ((line = reader.readLine()) != null) {
                out.write(counter++ +". "+ line+ "\n");
            }
        reader.close();
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

    }  }
}
