package collections;

import OOP_notes_by_rpg.Monster;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class HashMaps {

    public static void main(String[] args) {

//  Array type stored in key : value pairs
//              V Key<T> && V Value<T>
        HashMap<String, Integer> careerWins = new HashMap<>();
//      IOT add elements to a HashMap, using .put()
        careerWins.put("Gregg Popovich", 1366);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);
//      System.out.println(careerWins);
//        {Gregg Popovich=1367, Lenny Wilkens=1332, Don Nelson=1335}

//      IOT retrieve an item, use .get("KEY")
//        Returns ONLY the value
        System.out.println(careerWins.get("Gregg Popovich"));
//      Change a stored value with KEY and newVALUE
        careerWins.replace("Gregg Popovich", 1367);

//      STORING OBJECTS
//        HashMap<String, CodingLanguage> codeMap = new HashMap<>();
        Monster frostGiant = new Monster("Frost Giant", 15, 138, 25);
        Monster goblin = new Monster("Goblin", 15, 7, 5);
        Monster werewolf = new Monster("Werewolf", 11, 58, 7);

//      add multiple entries at once, we can use Map.ofEntries()
        Map<String, Monster> monsterMap = Map.ofEntries(
                entry("Frost Giant", frostGiant),
                entry("Goblin", goblin),
                entry("Werewolf", werewolf)
        );
//      Map.ofEntries returns an unmodifiable map
//      this is by design, for performance
//      conversion to Hasmap is required IOT modify
        Map<String, Monster> monsterHashMap = new HashMap<>(monsterMap);
        monsterHashMap.put("Skeleton", new Monster("Skeleton", 13, 13, 5));

//      IOT, generate sets and loops
//        SET is an unordered collection of UNIQUE Objects
//          IOT loop over all Hashmap entries:
//            Create and EntrySet (Set of EntryObjects)
//              EntryObjects have twoProps: K,V and GETTERS for K && V
        for (Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()) {
            System.out.printf("The key is %s%n", monsterEntry.getKey());
            System.out.printf("%s has %d hit points. %n", monsterEntry.getValue().getName(), monsterEntry.getValue().getHitPoints());
        }

        monsterHashMap.forEach((name, monster) -> {
            System.out.printf("%s has %d hit points. %n", name, monster.getHitPoints());
        });

//      GET set of Keys using .keySet method
//      Collection of values using the .values() method


    }

}
