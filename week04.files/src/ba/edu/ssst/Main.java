package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/names.txt");
        try {
            ArrayList<Student> students = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String newLine = scanner.nextLine();
                String[] elements = newLine.split(",");
                if (elements.length == 4) {
                    String firstName = elements[0].trim();
                    String lastName = elements[1].trim();
                    String institution = elements[2].trim();
                    Integer year = Integer.parseInt(elements[3].trim());
                    Student student = new Student(firstName, lastName, institution, year);
                    students.add(student);
                }
            }
            System.out.println("Processing completed!");
            for (Student student: students) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
