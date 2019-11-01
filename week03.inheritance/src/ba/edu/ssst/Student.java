package ba.edu.ssst;

public class Student extends Person {
    public Student(String first, String last) {
        super(first, last);
    }

    @Override
    public String toString() {
        return super.toString() + " is a student.";
    }
}
