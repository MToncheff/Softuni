package JavaAdvanced.StreamsFilesDirectories;

import java.io.*;

public class SerializeCustomObjects {
    private final static String DESTINATION = "C:\\Users\\Mitko Tonchev\\IdeaProjects\\Softuni\\src\\JavaAdvanced\\StreamsFilesDirectories\\Course.java";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(DESTINATION));
        Course course = new Course("#HowToSerializeCustomObject", 1);

        objectOutputStream.writeObject(course);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DESTINATION));

        Course myReturnedCourse = (Course) objectInputStream.readObject();

        System.out.println("Course name: " + myReturnedCourse.getName());
        System.out.println("Number of students: " + myReturnedCourse.getNumberOfStudents());
    }
    }
