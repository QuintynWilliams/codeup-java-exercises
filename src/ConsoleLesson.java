import java.util.Scanner;
public class ConsoleLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");

        String userInput = scanner.next();

//        System.out.println("The user entered: " + userInput);
//        OR
        System.out.printf("The user entered: %s", userInput);

    }
}
