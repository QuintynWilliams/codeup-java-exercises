package grades;

import OOP_notes_by_rpg.Monster;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

//  PROPERTY
    private String name;
    private ArrayList<Integer> grade;

//  GET/SET
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Integer> getGrade() {
        return grade;
    }
    public void addGrade(int grade) {
        this.grade.add(grade);
    }

//  METHODS
    public double getAvgGrade() {
        double total = 0;
        double numOfGrades = this.grade.size();

        for (int assignment: this.grade){
            total += assignment;
        }

        return total / numOfGrades;
}

    public static String getInput(Map thing) {
        Scanner sc = new Scanner(System.in);
        Map<String, Student> studentHash = new HashMap<>(thing);
        studentHash.forEach((name, student) -> {
            System.out.printf("| %s |  ", name);
        });
        System.out.printf("%nWhat student would you like to see more information on?%n");
        return sc.nextLine();
    }
    public static void userContinue(Map passedArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to see another student?");
        String getInput = sc.nextLine();
        boolean getInfo = getInput.equalsIgnoreCase("Y");

        while (getInfo == true) {
            gradeCLI(passedArray);
        }

        System.out.println("Goodbye, and have a wonderful day!");
    }
    public static void gradeCLI(Map placeholder) {
        String userSearch = Student.getInput(placeholder);
        Map<String, Student> studentHash = new HashMap<>(placeholder);
        if (placeholder.containsKey(userSearch)) {
            System.out.printf("""
                            Name: %s - GitHub Username: %s
                            Current Average: %.0f
                            """
                    , studentHash.get(userSearch).getName(),
                    userSearch,
                    studentHash.get(userSearch).getAvgGrade());
            userContinue(placeholder);
        } else if (userSearch.equalsIgnoreCase("all")) {
            studentHash.forEach((name, grades) -> {
                System.out.printf("""
                            Name: %s - GitHub Username: %s
                            Current Average: %.0f
                            """,grades.getName() , name, grades.getAvgGrade());
            });
        } else if (userSearch.equalsIgnoreCase("class")) {
            double total = 0;
            for (Map.Entry<String, Student> studentEntry : studentHash.entrySet()) {
                total += studentEntry.getValue().getAvgGrade();
            }
            double classAvg = total / placeholder.size();
            System.out.printf("Class Avg: %.0f", classAvg);

        }
        else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", userSearch);
            userContinue(placeholder);
        }

    }

//  CONSTRUCTOR
    public Student() {}
    public Student(String name, ArrayList<Integer> grade) {
        this.name = name;
        this.grade = grade;
    }
}
