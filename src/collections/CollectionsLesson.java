package collections;

import OOP_notes_by_rpg.Monster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

//        ArrayList<Poets> poetsList = Poets.generatePoetList();
//
//        poetsList.sort(Comparator.comparing(Poets::getName));
//
//        for (Poets poet : poetsList) {
//            System.out.printf("%s was born in %d, died in %d, and is a %s poet.%n", poet.getName(),
//                    poet.getBirthDate(), poet.getDeathDate(), poet.getStyle());
//        }

        ArrayList<CodingLanguage> codingLanguages = new ArrayList<>();

        CodingLanguage java = new CodingLanguage("Java", 1995, "Sun Microsystems");
        codingLanguages.add(java);

        CodingLanguage python = new CodingLanguage("Python", 1991, "Guido van Rossum");
        codingLanguages.add(python);

        CodingLanguage javascript = new CodingLanguage("JavaScript", 1995, "Netscape Communications Corporation");
        codingLanguages.add(javascript);

        CodingLanguage c = new CodingLanguage("C", 1972, "Dennis Ritchie");
        codingLanguages.add(c);

        CodingLanguage cPlusPlus = new CodingLanguage("C++", 1983, "Bjarne Stroustrup");
        codingLanguages.add(cPlusPlus);

        CodingLanguage go = new CodingLanguage("Go", 2009, "Google");
        codingLanguages.add(go);

        CodingLanguage swift = new CodingLanguage("Swift", 2014, "Apple Inc.");
        codingLanguages.add(swift);

        CodingLanguage rust = new CodingLanguage("Rust", 2010, "Mozilla Foundation");
        codingLanguages.add(rust);

        CodingLanguage kotlin = new CodingLanguage("Kotlin", 2011, "JetBrains");
        codingLanguages.add(kotlin);

        CodingLanguage ruby = new CodingLanguage("Ruby", 1995, "Yukihiro Matsumoto");
        codingLanguages.add(ruby);

        CodingLanguage php = new CodingLanguage("PHP", 1995, "Rasmus Lerdorf");
        codingLanguages.add(php);

        CodingLanguage objectiveC = new CodingLanguage("Objective-C", 1983, "Brad Cox");
        codingLanguages.add(objectiveC);

        CodingLanguage sql = new CodingLanguage("SQL", 1974, "IBM");
        codingLanguages.add(sql);

        CodingLanguage swiftObjectiveC = new CodingLanguage("Swift/Obj-C", 2014, "Apple Inc.");
        codingLanguages.add(swiftObjectiveC);

        CodingLanguage perl = new CodingLanguage("Perl", 1987, "Larry Wall");
        codingLanguages.add(perl);

        CodingLanguage groovy = new CodingLanguage("Groovy", 2003, "James Strachan");
        codingLanguages.add(groovy);

        CodingLanguage scala = new CodingLanguage("Scala", 2004, "Martin Odersky");
        codingLanguages.add(scala);

        CodingLanguage lua = new CodingLanguage("Lua", 1993, "Roberto Ierusalimschy");
        codingLanguages.add(lua);

        CodingLanguage r = new CodingLanguage("R", 1993, "Ross Ihaka and Robert Gentleman");
        codingLanguages.add(r);


//      TODO: Loop over the arrayList of languages, outputting their name, creation date, and creators.
//       Sort the arrayList by name of language alphabetically. Output again.
//       Bonus: Sort the arrayList by creation date.

        codingLanguages.sort(Comparator.comparing(CodingLanguage::getName));

        codingLanguages.sort(Comparator.comparing(CodingLanguage::getCreatedDate));

        for (CodingLanguage lang : codingLanguages) {
            System.out.printf("%s, created in %d, by %s. %n", lang.getName(), lang.getCreatedDate(), lang.getCreator());
        }

    }

}
