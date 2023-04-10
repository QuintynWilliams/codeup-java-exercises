import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//      The value of pi is approximately 3.14.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s\n", pi);

//  Explore the Scanner Class
//      Prompt, Input, Print
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();

        System.out.printf("You input: %s!\n", userInput);

        System.out.println("Enter three words:");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("Enter a sentence:");
        scanner.nextLine();
        String userSentence = scanner.nextLine();

        System.out.println(userSentence);

//  Calculate the perimeter and area of rooms
//      BONUS: Allow decimal entries for input/calculations
        System.out.println("Enter room length:");
        float lengthRoom = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter room width:");
        float widthRoom = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter room height:");
        float heightRoom = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Room Perimeter: " + ((lengthRoom * 2) + (widthRoom * 2)));
        System.out.println("Room Area: " + (lengthRoom * widthRoom));
        System.out.println("Room Volume: " + (lengthRoom * widthRoom * heightRoom));

    }

}
