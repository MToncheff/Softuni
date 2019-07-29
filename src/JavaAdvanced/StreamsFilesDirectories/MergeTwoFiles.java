package JavaAdvanced.StreamsFilesDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {


    Path inputOne = Paths.get("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\inputOne.txt");
    Path inputTwo = Paths.get("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\inputTwo.txt");
        PrintWriter pw = new PrintWriter("thirdFile.txt");

        BufferedReader firstFile = Files.newBufferedReader(inputOne);
    BufferedReader secondFile = Files.newBufferedReader(inputTwo);
        String line1 = firstFile.readLine();
        String line2 = secondFile.readLine();
        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.println(line1);
                line1 = firstFile.readLine();
            }

            if(line2 != null)
            {
                pw.println(line2);
                line2 = secondFile.readLine();
            }
        }
        pw.flush();

        // closing resources
        firstFile.close();
        secondFile.close();
        pw.close();
        try (BufferedReader br = new BufferedReader(new FileReader("thirdFile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}