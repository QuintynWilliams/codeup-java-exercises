package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    private boolean hold;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Input a string");
        return scanner.next();
    }


    public boolean yesNo() {
        System.out.println("Input a YES||NO response");
        String input = scanner.next();
        if (input.startsWith("y")) {
            hold = true;
        } else if (input.startsWith("n")) {
            hold = false;
        }
        return hold;
    }

    public int getInt(int min, int max) {
        System.out.printf("Input a number between %d and %d \n", min, max);
        String inputNum = scanner.next();
        boolean inRange = Integer.parseInt(inputNum) < max && Integer.parseInt(inputNum) > min;

        while (inRange == false) {
            System.out.printf("Input a number between %d and %d \n", min, max);
            inputNum = scanner.next();
            inRange = Integer.parseInt(inputNum) < max && Integer.parseInt(inputNum) > min;
        }

        return Integer.parseInt(inputNum);
    }
    public int getInt() {
        System.out.println("Input a number:");
        return Integer.parseInt(scanner.next());
    }

    double getDouble(double min, double max) {
        System.out.printf("Input a number between %.2f  and %.2f\n", min, max);
        String inputNum = scanner.next();
        boolean inRange = Double.parseDouble(inputNum) < max && Double.parseDouble(inputNum) > min;

        while (inRange == false) {
            System.out.printf("Input a number between %.2f  and %.2f\n", min, max);
            inputNum = scanner.next();
            inRange = Double.parseDouble(inputNum) < max && Double.parseDouble(inputNum) > min;
        }

        return Double.parseDouble(inputNum);
    }
    double getDouble() {
        System.out.println("Input a number:");
        return Double.parseDouble(scanner.next());
    }


    public static void main(String[] args) {

        Input testString = new Input();
        System.out.println(testString.getString());
        System.out.println(testString.yesNo());
        System.out.println(testString.getInt(1,20));
        System.out.println(testString.getInt());
        System.out.println(testString.getDouble(1.50,3.75));
        System.out.println(testString.getDouble());
    }

}
