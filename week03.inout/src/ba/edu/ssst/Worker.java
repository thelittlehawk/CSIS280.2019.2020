package ba.edu.ssst;

public class Worker extends Person implements ISalary {
    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int Salary() {
        return 500;
    }
}
