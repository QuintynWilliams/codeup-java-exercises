package grades;

import OOP_notes_by_rpg.Monster;
import collections.CodingLanguage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> bobGrades = new ArrayList<>(List.of(95, 84, 74, 99, 76));
        Student bob = new Student("Bob", bobGrades);
        students.add(bob);

        ArrayList<Integer> frankGrades = new ArrayList<>(List.of(75, 34, 84, 91, 69));
        Student frank = new Student("Frank", frankGrades);
        students.add(frank);

        ArrayList<Integer> rickGrades = new ArrayList<>(List.of(87, 100, 74, 86));
        Student rick = new Student("Rick", rickGrades);
        students.add(rick);

        for (Student peep : students) {
            System.out.printf("%s has an average of: %.0f. %n", peep.getName(), peep.getAvgGrade());
        }



    }

}
