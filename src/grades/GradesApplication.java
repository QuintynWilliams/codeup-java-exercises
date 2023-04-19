package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class GradesApplication {

    public static void main(String[] args) {

//  TODO: create a HashMap named students:
//   Keys that are strings that represent github usernames
//   Values that are Student objects
//   Create at least 4 Student objects with at least 3 grades each,
//   and add them to the map.

        ArrayList<Integer> bobGrades = new ArrayList<>(List.of(95, 84, 74, 99, 76));
        Student bob = new Student("Bob", bobGrades);

        ArrayList<Integer> frankGrades = new ArrayList<>(List.of(75, 34, 84, 91, 69));
        Student frank = new Student("Frank", frankGrades);

        ArrayList<Integer> rickGrades = new ArrayList<>(List.of(87, 100, 74, 86));
        Student rick = new Student("Rick", rickGrades);

        Map<String, Student> students = Map.ofEntries(
                entry("bob_tha_developer", bob),
                entry("let_meBe=Frank", frank),
                entry("downW/rick_ness", rick)
        );

//  TODO: Print the list of GitHub usernames out to the console
//    Ask the user which student they would like to see more info
//    User should enter a GitHub username (i.e. one of the keys in your map).
//      If NO match mapKEY match: print "no users with that username"
//      If match: display name and grades.
//    Ask to continue || Exit

        students.forEach((name, monster) -> {
            System.out.printf("%s's grade avg: %f. %n", name, monster.getAvgGrade());
        });

//        Student.gradeCLI(Student.getInput(), students);


    }

}
