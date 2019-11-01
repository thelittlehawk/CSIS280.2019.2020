package ba.edu.ssst;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker("Ahmed", "Muzurovic");
        Student student = new Student("Samir", "Hajdarevic");
        Manager manager = new Manager("Sef", "Pravi");

        ISalary newManager = new Manager("Novi", "Sef");
        ISalary newWorker = new Worker("Novi", "Radnik");

        ArrayList<ISalary> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(newManager);
        employees.add(newWorker);

        for (ISalary employee: employees) {
            Boolean isManager = employee.getClass() == Manager.class;
            if (isManager) {
                System.out.println(employee.toString() + " " + employee.Salary() + " " + ((Manager)employee).Bonus());
                System.out.println("==========");
            } else {
                System.out.println(employee.toString() + " " + employee.Salary());
                System.out.println("==========");
            }
        }
    }
}
