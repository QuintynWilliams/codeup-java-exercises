public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Add values: " + addCalc(8, 2));
        System.out.println("Subtract values: " + subCalc(8, 2));
        System.out.println("Multiply values: " + multCalc(8, 2));
        System.out.println("Divide values: " + divCalc(8, 2));
        System.out.println("Modulus values: " + modCalc(8, 2));
    }

//  Ex 1
    public static int addCalc(int one, int two) {
        return one + two;
    }

    public static int subCalc(int one, int two) {
        return one - two;
    }

    public static int multCalc(int one, int two) {
        return one * two;
    }

    public static int divCalc(int one, int two) {
        return one / two;
    }

    public static int modCalc(int one, int two) {
        return one % two;
    }

}



