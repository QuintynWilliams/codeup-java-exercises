package OOP_notes_by_rpg;

public class Dice {

    public static int roll (int amount, int sides) {
        int total = 0;
        for (int i = 0; i < amount; i++ ) {
            total += (int) (Math.random()*sides)+1;
        }
        return total;
    }

}
