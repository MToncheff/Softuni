package JavaAdvanced.StreamsFilesDirectories;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SerializeArrayList {
    private static final String FILE_PATH = "C:\\\\Users\\\\Mitko Tonchev\\\\IdeaProjects\\\\Softuni\\\\src\\\\JavaAdvanced\\\\StreamsFilesDirectories\\\\list.ser ";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Whatever");
        list.add("oshte");

        FileOutputStream listCopy = new FileOutputStream(FILE_PATH);
        ObjectOutputStream createFile = new ObjectOutputStream(listCopy);

        createFile.writeObject(list);

        FileInputStream loadList = new FileInputStream(FILE_PATH);
        ObjectInputStream loadFile = new ObjectInputStream(loadList);

        ArrayList<String> returnedList = (ArrayList<String> )loadFile.readObject();
        //To Print the result

        for (String result : returnedList) {
            System.out.println(result);
        }
    }
}
