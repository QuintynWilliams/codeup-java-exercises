import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ghoul Hunter");
        System.out.println("Are you ready to hunt? [Y/N]");
        char userStart = scanner.next().charAt(1);


        int result = randomizer(3, 12);
        System.out.println(result);
    }
    public static int randomizer(int min, int max) {
        Random random = new Random();
        boolean test = random.nextInt(30)==0;
        int bob = random.nextInt(max - min + 1) + min;
        if (test) {
            return bob * 3;
        } else {
            return bob;
        }
    }
}
