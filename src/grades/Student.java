package grades;

import java.util.ArrayList;

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
    public void addGrade(ArrayList<Integer> grade) {
        this.grade = grade;
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

//  CONSTRUCTOR
    public Student() {}
    public Student(String name, ArrayList<Integer> grade) {
        this.name = name;
        this.grade = grade;
    }
}
