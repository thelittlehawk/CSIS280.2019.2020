package ba.edu.ssst;

public class Main {

    public static void main(String[] args) {
        int broj1 = 20;
        Integer broj2 = new Integer(10) ;

        String text = new String("Some value");

        System.out.println(broj1);
        System.out.println(broj2);

        String output = text + " is " + broj1;
        System.out.println(output);

        Student student1 = new Student("John");

        Student student2 = new Student("Not John", "Doe");

        System.out.println(student1 + " test");

        System.out.println(student2.getName() + ", " + student2.getLastName());
    }
}
