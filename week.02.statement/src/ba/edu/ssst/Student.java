package ba.edu.ssst;

public class Student extends Object {
    private final String name;

    private final String lastName;

    public Student(String name) {
        this.name = name;
        this.lastName = "";
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + getLastName();
    }
}
