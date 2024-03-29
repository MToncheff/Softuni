package JavaOOP.Inheritance.Mankind;
import java.security.InvalidParameterException;

public class Student extends Human {

    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) {
        if(facultyNumber.length() < 5 || facultyNumber.length() > 10){
            throw new InvalidParameterException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return String.format("%s%nFaculty Number: %s",
                super.toString(), this.facultyNumber);
    }
}