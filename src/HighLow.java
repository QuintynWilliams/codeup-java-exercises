import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int house = houseGuess();
        int user = getInteger();

        highLow(house, user);
    }

    public static int getInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the House Roll [between 1-100]");
        String playerGuess = sc.nextLine();
        boolean inRange = Integer.parseInt(playerGuess) < 100 && Integer.parseInt(playerGuess) > 1;

        while (inRange == false) {
            System.out.println("Guess the House Roll [between 1-100]");
            playerGuess = sc.nextLine();
            inRange = Integer.parseInt(playerGuess) < 100 && Integer.parseInt(playerGuess) > 1;
        }

        return Integer.parseInt(playerGuess);

    }

    public static int houseGuess() {
        Random rn = new Random();

        int house = rn.nextInt(100 - 1 + 1) + 1;

        return house;
    }

    public static void highLow(int x, int y) {
        if (x > y) {
            System.out.println("HIGHER");
            highLow(x, getInteger());
        } else if (x < y) {
            System.out.println("LOWER");
            highLow(x, getInteger());
        } else {
            System.out.println("GOOD GUESS");
        }

    }

}
