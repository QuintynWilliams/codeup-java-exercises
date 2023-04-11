import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int house = houseGuess();

        highLow(house, getInteger(), 1, 10);
    }

    public static void clearConsole () {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
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

    public static void highLow(int x, int y, int z, int limit) {
         if (limit == 1) {
            System.out.println("House wins, the number is " + x);
        } else if (x > y) {
            System.out.println("HIGHER   |   " + (limit - 1) + " guesses left. \n");
            highLow(x, getInteger(), z + 1, limit - 1);
        } else if (x < y) {
            System.out.println("LOWER    |   " + (limit - 1) + " guesses left. \n");
            highLow(x, getInteger(), z + 1, limit - 1);
        } else if (x == y){
            System.out.println("CONGRATS |   " + "Player wins with " + z + " turns");
        }
    }

}
