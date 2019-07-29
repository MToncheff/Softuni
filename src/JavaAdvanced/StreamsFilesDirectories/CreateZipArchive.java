package JavaAdvanced.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
    private static final String FILE_LOCATION_01 = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\first.txt";
    private static final String FILE_LOCATION_02 = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\second.txt";
    private static final String FILE_LOCATION_03 = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\third.txt";
    private static final String DESTINATION = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\files.zip";

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(FILE_LOCATION_01);

        byte[] firstFileBytes = fileInputStream.readAllBytes();
        fileInputStream = new FileInputStream(FILE_LOCATION_02);
        byte[] secondFileBytes = fileInputStream.readAllBytes();
        fileInputStream = new FileInputStream(FILE_LOCATION_03);
        byte[] thirdFileBytes = fileInputStream.readAllBytes();

        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(DESTINATION));

        zipOutputStream.putNextEntry(new ZipEntry("first.txt"));
        zipOutputStream.write(firstFileBytes);
        zipOutputStream.putNextEntry(new ZipEntry("second.txt"));
        zipOutputStream.write(secondFileBytes);
        zipOutputStream.putNextEntry(new ZipEntry("third.txt"));
        zipOutputStream.write(thirdFileBytes);
        zipOutputStream.flush();
        zipOutputStream.close();
    }
}
