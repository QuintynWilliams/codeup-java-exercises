import java.util.ArrayList;

public class ExceptionsHandlingLesson {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
//      Java refers to an EXCEPTION, 'Cause no pos 99 in numbers
//        System.out.println(numbers[99]);
//      You wont see this, Java stuck at ^^^
//        System.out.println("After Error");

//      Input an EXCEPTION
//        .˙.> Like TryCatch in JS
        try {
            System.out.println(numbers[99]);
        } catch (Exception e) {
            assert System.out != null;
            System.out.println("In Error");
        }

//      Throw an Exception
        try {
            System.out.println(numbers[99]);
            throw new Exception("Something Bad");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf(String.valueOf(e));
//          When unsure of what the erroe might be, run Exception e
        } catch (Exception e) {
            System.out.printf("%nnew exception");
            System.out.printf(String.valueOf(e));
        } finally {
            System.out.printf("%nMade it through the TryCatch");
        }

    }

}
