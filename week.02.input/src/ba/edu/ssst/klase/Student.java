package ba.edu.ssst.klase;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
