package collections;

import OOP_notes_by_rpg.Monster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsLesson {

    public static void main(String[] args) {

        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

//      Collections
//                   v Obj Type
        ArrayList<Monster> monsterList = new ArrayList<>();
//      Arrays require to assign values to variables
//      Array Syntax: monsterArray[0] = blueDdragon;
        monsterList.add(orc);
        monsterList.add(ogre);
        monsterList.add(blueDragon);

//      OR add all at once, by import List class && calling at creation - - v
        ArrayList<Monster> monsterList2 = new ArrayList<>(List.of(orc, ogre, blueDragon));

//      OR add an existing array w/ asList
        Monster[] closetMonsters = {orc, ogre, blueDragon};
        ArrayList<Monster> monsterList3 = new ArrayList<>(Arrays.asList(closetMonsters));


//      Get total elements
        System.out.println(monsterList.size());

//      Get elements by index with .get(i), just doesnt use the [i] notation
        System.out.println(monsterList.get(1).getName());

        for (Monster monsty : monsterList) {
            System.out.println(monsty.getName());
        }

    }

}
