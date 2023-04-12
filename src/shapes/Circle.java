package shapes;

import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }


    public static void main(String[] args) {
        Circle myCircle = new Circle(50);
        System.out.println(myCircle.radius);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());
    }

}


