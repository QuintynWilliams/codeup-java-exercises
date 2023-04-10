import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//      1.a While Loops
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%s ",i);
//            i++;
//        }


//      1.b Do While Loops
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+= 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-= 5;
//        } while (i >= -10);

//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//      1.c For
//        for (int i = 0; i <= 100; i+= 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i-= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2L; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


//      2. Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }  else {
//                System.out.println(i);
//            }
//        }

//      3. Display a table of powers.
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userInput = sc.nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= userInput; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%-6s | %-7s | %-6s \n", i, square, cube);
        }

    }
}
