import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//      Ex 1 Outputs
//        System.out.println("Add values: " + addCalc(8, 2));
//        System.out.println("Subtract values: " + subCalc(8, 2));
//        System.out.println("Multiply values: " + multCalc(5, 2));
//        System.out.println("Multiply values (Loop): " + multCalcLoop(4, 3));
//        System.out.println("Multiply values (Rec): " + multCalcRec(4, 5));
//        System.out.println("Divide values: " + divCalc(8, 2));
//        System.out.println("Modulus values: " + modCalc(8, 2));

//      Ex 2 Outputs
//        System.out.println("Int-Range: Enter a number between 1 and 10:");
//        int userInput = getInteger(1, 10);
//        System.out.println("Congratulations, " + userInput + " is in range!");

//      Ex 3 Outputs
//        System.out.println("Int-Factor: Enter a number between 1 and 10:");
//        int userFactorInput = getInteger(1, 10);
//        long factorNum = getFactor(userFactorInput);
//        System.out.println("Factorial of " + userFactorInput + " is " + factorNum);

//      Ex 4 Outputs
        diceRoller();
    }

//  Ex 1
    public static int addCalc(int x, int y) {
        return x + y;
    }

    public static int subCalc(int x, int y) {
        return x - y;
    }

    public static int multCalc(int x, int y) {
        return x * y;
    }

    public static int multCalcLoop(int x, int y) {
        int total = 0;
        for (int i = 0; i < y; i++) {
            total += x;
        }
        return total;
    }

    public static int multCalcRec(int x, int y) {
        if (x < y) {
            return multCalcRec(y, x);
        } else if (y != 0) {
            return (x + multCalcRec(x, y - 1));
        } else {
            return 0;
        }
    }

    public static int divCalc(int x, int y) {
        return x / y;
    }

    public static int modCalc(int x, int y) {
        return x % y;
    }

//  Ex 2
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        String getInput = sc.nextLine();
        boolean inRange = Integer.parseInt(getInput) < max && Integer.parseInt(getInput) > min;

        while (inRange == false) {
            System.out.println("Enter a number between 1 and 10:");
            getInput = sc.nextLine();
            inRange = Integer.parseInt(getInput) < max && Integer.parseInt(getInput) > min;
        }
        return Integer.parseInt(getInput);
    }

//  Ex 3
    public static long getFactor(int x) {
        long y = 1;
        for (int i = 1; i <= x; i++) {
            y *= i;
        }
        return y;
    }

//  Ex 4
    public static void diceRoller() {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Die-Roll: Enter number of dice sides");
        String userSide = sc.nextLine();
        System.out.println("Roll Dice [Y/N]");
        String userRoll = sc.nextLine();
        boolean rollDice = userRoll.equalsIgnoreCase("Y");

        while(rollDice == true) {
            int diceOne = rn.nextInt(Integer.parseInt(userSide) - 1 + 1) + 1;
            int diceTwo = rn.nextInt(Integer.parseInt(userSide) - 1 + 1) + 1;

            System.out.println("Dice 1 = " + diceOne + "\n" + "Dice 2 = " + diceTwo);

            System.out.println("Die-Roll: Enter number of dice sides");
            userSide = sc.nextLine();
            System.out.println("Roll Again? [Y/N]");
            userRoll = sc.nextLine();
            rollDice = userRoll.equalsIgnoreCase("Y");
        }
    }

}



