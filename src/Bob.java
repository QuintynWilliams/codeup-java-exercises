import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to talk to Bob? [Y/N]");
        String getInput = sc.nextLine();
        boolean talk = getInput.equalsIgnoreCase("Y");

        while (talk == true) {
            System.out.println("What would you like to say to Bob?");
            String userInput = sc.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.isBlank()) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever");
            }

            System.out.println("Would you like to talk to Bob? [Y/N]");
            getInput = sc.nextLine();
            talk = getInput.equalsIgnoreCase("Y");
        }

    }
}
