package JavaAdvanced.StreamsFilesDirectories;

import java.io.File;

public class GetFolderSize {
    private static final String DIRECTORY_PATH = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\Exercises Resources";

    public static void main(String[] args) {
        File[] files = new File(DIRECTORY_PATH).listFiles();
        long totalSize = 0;

        for (File file : files) {
            if (file.isFile()) {
                totalSize += file.length();
            }
        }
        System.out.println(String.format("Folder size: %s", totalSize));

    }
}
