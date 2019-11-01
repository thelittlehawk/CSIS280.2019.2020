package ba.edu.ssst;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String institution;
    private final Integer year;

    public Student(String firstName, String lastName, String institution, Integer year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.institution = institution;
        this.year = year;
    }

    @Override
    public String toString() {
        return "First: " + this.firstName + " | Last: " + this.lastName + " (" + this.institution + " - " + this.year.toString() + ")";
    }
}
