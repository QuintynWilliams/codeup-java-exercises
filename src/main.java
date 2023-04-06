public class main {
    public static void main (String[] args) {
        System.out.println("Hello World");

        int myFavoriteNumber = 66;
        System.out.println(myFavoriteNumber);

        String myString = "My second string";
//        char myString = "My second string";
//        String myString = 3.14159;
        System.out.println(myString);

//        long myNumber = 3.14;
//        long myNumber = 123L;
//        float myNumber = 3.14;
        long myNumber = 123;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);  5
//        System.out.println(x);    6

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = "Bob the Builder";

//  class java.lang.String cannot be cast to class java.lang.Integer
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//  string cannot be int
//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.print(x);

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

        int myMax = Integer.MAX_VALUE;
        System.out.println(myMax);
    }
}
