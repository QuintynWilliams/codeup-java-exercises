import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//  Needed as numbers is defined as int |
//  w/o prints: [I@4617c264             V
        System.out.println(Arrays.toString(numbers));

/* TODO: Create an array that holds 3 Person objects. Assign a new instance of
    the Person class to each element. Iterate through the array and print out
    the name of each person in the array. */
        Person bob = new Person("Bob");
        Person frank = new Person("Frank");
        Person joe = new Person("Joe");
        Person[] people = {bob, frank, joe};
        for (Person n : people) {
            System.out.println(n.getName());
        }

/* TODO: Create a static method named addPerson. It should accept an array of Person
    objects, as well as a single person object to add to the passed array. It
    should return an array whose length is 1 greater than the passed array, with
    the passed person object at the end of the array. */

/*
     public Fighter () {
        totalFighters++;
    }
    public Fighter(String name, int hitPoints, int maxDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }

    int d20roll = Dice.roll(2, 20);
    System.out.println("You rolled: " + d20roll);
 */

    }

}
