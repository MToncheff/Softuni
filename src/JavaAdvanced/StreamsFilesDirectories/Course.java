package JavaAdvanced.StreamsFilesDirectories;

import java.io.Serializable;

public class Course implements Serializable {
    private String name;
    private Integer numberOfEnrolledStudents;

    public Course(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfEnrolledStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfStudents() {
        return numberOfEnrolledStudents;
    }

}