package grades;

import OOP_notes_by_rpg.Monster;

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
        if (placeholder.containsKey(userSearch)) {
            Map<String, Student> studentHash = new HashMap<>(placeholder);
            System.out.printf("""
                            Name: %s - GitHub Username: %s
                            Current Average: %.0f
                            """
                    , studentHash.get(userSearch).getName(),
                    userSearch,
                    studentHash.get(userSearch).getAvgGrade());
            userContinue(placeholder);
        } else {
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
