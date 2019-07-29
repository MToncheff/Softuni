package JavaAdvanced.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAPicture {
    public static void main(String[] args) {


        try (FileInputStream picturePath = new FileInputStream("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\picture.jpg")) {
            byte[] bytes = picturePath.readAllBytes();
            FileOutputStream newPicture = new FileOutputStream("C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\picture-copy.jpg");
            newPicture.write(bytes);

        } catch
        (IOException e) {
            e.printStackTrace();
        }
    }
}

