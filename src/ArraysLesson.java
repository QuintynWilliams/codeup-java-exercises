public class ArraysLesson {

    public static void main(String[] args) {

//      Use for variable driven arrays or manipulating the array
        int sizeofArray = 5;      // V - - - - - Can be declared HERE
        int[] numbers = new int[sizeofArray]; // EX: new int [5]
            numbers[0] = 42;
            numbers[1] = 567;
            numbers[2] = 457;
            numbers[4] = 1267;

//  Array Initializer Syntax
//      Use when you know what is being put in the array
        int[] moreNumbers = {45, 56, 67, 78};


        System.out.printf("Array: %d",numbers[2]);
//  Array Loops
//      Enhanced for loop when you dont need the INDEX
        for (int number : numbers) {
            System.out.printf("Num at index: %d%n", number);
//          numbers[3] = 0, as a DEFAULT VALUE (was not declared)
        }

        System.out.printf("%nArray Initializer: %d",moreNumbers[2]);
//      Trad For Loop
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.printf("Num at index %d: %d%n", i, moreNumbers[i]);
        }

//      ARRAYS of OBJECTS: SEE src/OOP_notes_by_rpg

    }

}
