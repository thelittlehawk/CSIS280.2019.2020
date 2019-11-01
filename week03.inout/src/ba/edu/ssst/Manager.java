package ba.edu.ssst;

public class Manager extends Worker {
    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int Salary() {
        return super.Salary() + 500;
    }

    public double Bonus() {
        return this.Salary() * 1.2;
    }
}
