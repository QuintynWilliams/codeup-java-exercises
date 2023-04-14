import OOP_notes_by_rpg.Monster;

import java.util.Arrays;

public class ArraysLesson {
//    v - - Must be declared static in order to be declared outside of method
//    static Monster school = new Monster("school", 24, 234, 24);

    public static void main(String[] args) {
//        System.out.println(school);

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

//        System.out.printf("Array: %d",numbers[2]);
//  Array Loops
//      Enhanced for loop when you dont need the INDEX
        for (int number : numbers) {
            System.out.printf("Num at index: %d%n", number);
//          numbers[3] = 0, as a DEFAULT VALUE (was not declared)
        }

//        System.out.printf("%nArray Initializer: %d",moreNumbers[2]);
//      Trad For Loop
//        for (int i = 0; i < moreNumbers.length; i++) {
//            System.out.printf("Num at index %d: %d%n", i, moreNumbers[i]);
//        }

//      ARRAYS of OBJECTS: SEE src/OOP_notes_by_rpg/Monster
//        Creating objects based on Traits of the Monster Class
//        Uses Constructor to set values
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        Monster[] monsters = {orc, ogre, blueDragon};

//        for (Monster monster : monsters) {
//            System.out.printf("""
//                   %s
//                   HP: %d
//                   Armor  |  DMG
//                    %d       %d%n
//                   """, monster.getName(), monster.getHitPoints(), monster.getArmorClass(),
//                    monster.getDamage());
//        }

//      Sorting Arrays, STATIC METHOD
//        https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
        Arrays.sort(numbers);
        System.out.println("\n POST SORT...");
        for (int number : numbers) {
            System.out.printf("Num at index: %d%n", number);
        }

        Monster whiteGhoul = new Monster("White Ghoul", 9, 12, 15);

//      Added a new object to array, CREATES A NEW ARRAY COMPLETELY
        Monster[] addedMonster = ArraysLesson.addMonster(monsters, whiteGhoul);

        for (Monster n : addedMonster) {
            System.out.printf("New Monsters: %s%n", n.getName());
        };

    }

    public static Monster[] addMonster(Monster[] monstersArray, Monster newMonster) {
//      Creates a new array that is empty, FOR LOOP each of old values to OG index
//      Monster[] newMonsterArray = new Monster[monstersArray.length+1];
//        OR, creates new array mirrored from OG && can increase length
        Monster[] newMonsterArray = Arrays.copyOf(monstersArray, monstersArray.length+1);
        newMonsterArray[newMonsterArray.length -1] = newMonster;
        return newMonsterArray;
    }

}
