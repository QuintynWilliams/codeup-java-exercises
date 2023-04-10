import java.util.Scanner;

public class CtrlStatementsLoopsLesson {
    public static void main(String[] args) {
//      Boolean Expressions
//      >, >=, <, <=, ==, !=
        double discountPercentage = 2.3;
        System.out.println(discountPercentage != 2.0);

//      Logical Operators
//      &&, ||, &, |, !
        System.out.println(discountPercentage > 3 && discountPercentage == 2.3);

//      String Comparison
        String name = "Quintyn";
        System.out.println(name.equals("Quintyn"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Continue? [Y/N]");
        String userCont = scanner.next();

        boolean confirmation = userCont.equalsIgnoreCase("Y");
        System.out.println(confirmation);

//      Control Structures
//      if, else if, else
        if (discountPercentage > 3) {
//            conditional code
            System.out.println("Discount percentage is bigger than 2.");
        } else {
            System.out.println("Less than 3: No discount for you.");
        }

//      Switch
        int caseSwitch = 1;
        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default Case");
        }

//      While Loop
//      Resolve WITHIN the loop
        int i = 0;
        while (i < 10) {
            System.out.printf("i is %s\n", i);
            i++;
        }

//      Do-While Loop
        int j = 0;
        do {
            System.out.printf("j is %s\n", j);
            j++;
        } while (j < 10);

//      For Loop
        for (int k = 0; k < 10; k++) {
            System.out.printf("k is %s\n", k);
        }

//      Break and Continue
        for (int k = 0; k < 10; k++) {
            System.out.printf("k is %s\n", k);
            if (k == 5) {
//              Breaks loop at 5
              break;
//              Skips value and finalizes loop
//              continue;
            }
        }

    }
}
