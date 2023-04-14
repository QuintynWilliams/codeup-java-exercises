public class ArraysLesson {

    public static void main(String[] args) {

//      Use for variable driven arrays or manipulating the array
        int sizeofArray = 5;

        int[] numbers = new int[sizeofArray];

        numbers[0] = 42;
        numbers[1] = 567;
        numbers[2] = 457;
        numbers[3] = -560;
        numbers[4] = 1267;

//  Array Initializer Syntax
//      Use when you know what is being put in the array
        int[] moreNumbers = {45, 56, 67, 78};

        System.out.println("Array Initializer: " + moreNumbers[2]);
        System.out.println("Array: " + numbers[2]);

//  Array Loops
//      Enhanced for loop when you dont need the INDEX
        for (int number : numbers) {
            System.out.printf("Num at index: %d%n", number);
        }

//      Trad For Loop
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.printf("Num at index %d: %d%n", i, moreNumbers[i]);
        }

    }

}
