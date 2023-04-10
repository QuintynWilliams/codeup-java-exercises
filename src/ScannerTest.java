import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      Get User's name
        System.out.println("What is your name?");

        String userInput = scanner.next();

        System.out.printf("Hello, %s!\n", userInput);

//      Get User full name
        System.out.println("What is your full name?");

//      Enables a second input and ignore enter key
//          Technique absorbs the carriage return.
        scanner.nextLine();

        String fullName = scanner.nextLine();

        System.out.printf("Hi, %s!\n", fullName);

        System.out.println("What is your favorite number?");

        scanner.nextLine();

        String inputNum = scanner.nextLine();

        int favNum = Integer.parseInt(inputNum);

        System.out.println(favNum + favNum);
    }
}
