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
//        System.out.println("What number would you like to go up to?");
//        int userInput = sc.nextInt();
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInput; i++) {
//            int square = i * i;
//            int cube = i * i * i;
//            System.out.printf("%-6s | %-7s | %-6s \n", i, square, cube);
//        }

//      4. Convert Num to Letter Grade
        System.out.println("Enter grade (0 - 100):");
        int userGrade = sc.nextInt();
        String userLetter;
//                    if (100 - userGrade <= 1) {
//                magnus = '+';
//            } else if (100 - userGrade <= 10) {
//                magnus = '-';

        if (userGrade >= 88) {
            userLetter = "A";
            if (userGrade >= 99) {
                userLetter = "A+";
            } else if (userGrade <= 87) {
                userLetter = "A-";
            }
        } else if (userGrade < 88 && userGrade >= 80) {
            userLetter = "B";
            if (userGrade >= 86) {
                userLetter = "B+";
            } else if (userGrade <= 81) {
                userLetter = "B-";
            }
        } else if (userGrade < 80 && userGrade >= 67) {
            userLetter = "C";
            if (userGrade >= 78) {
                userLetter = "C+";
            } else if (userGrade <= 68) {
                userLetter = "C-";
            }
        } else if (userGrade < 67 && userGrade >= 60) {
            userLetter = "D";
            if (userGrade >= 65) {
                userLetter = "D+";
            } else if (userGrade <= 61) {
                userLetter = "D-";
            }
        } else {
            userLetter = "F";
        }

        System.out.println(userLetter);
    }
}
