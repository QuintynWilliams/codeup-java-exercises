package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input testString = new Input();
        double circRadius = testString.getDouble();
        Circle myCircle = new Circle(circRadius);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());

    }

}
