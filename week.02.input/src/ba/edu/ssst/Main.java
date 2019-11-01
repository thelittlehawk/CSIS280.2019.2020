package ba.edu.ssst;

import ba.edu.ssst.klase.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();
//
//        Student student = new Student(input);
//        System.out.println(student);

//        int[] grades = new int[10];
//        grades[0] = 1;
//        grades[1] = 1;
//        System.out.println(grades[0] + " " + grades[5] + " " + grades[8]);

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        System.out.println("Array has " +  array.size() + " elements");
        System.out.println(array.get(0));

        array.remove(0);
        System.out.println("Array has " +  array.size() + " elements");
        System.out.println(array.get(0));


        System.out.println("====");
        for (int i = 0 ; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("====");
        for (Integer num: array) {
            System.out.println(num);
        }

    }
}
