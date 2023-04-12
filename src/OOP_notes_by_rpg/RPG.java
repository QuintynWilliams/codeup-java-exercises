package OOP_notes_by_rpg;

public class RPG {
    public static void main(String[] args) {

//  Instance: One
        Fighter fighter1 = new Fighter();
        fighter1.setName("Anita");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(16);
        fighter1.printStats();

//  Instance: Two
        Fighter fighter2 = new Fighter();
        fighter2.setName("Gojira");
        fighter2.setHitPoints(20);
        fighter2.setMaxDamage(11);
        fighter2.printStats();

//  Instance: Three
        Fighter fighter3 = new Fighter ("Shrek", 95, 45);
        fighter3.printStats();

//  Instance: Four
        Fighter fighter4 = new Fighter ("Therion");
        fighter4.printStats();

//  Static
        int d20roll = Dice.roll(2, 20);
        System.out.println(d20roll);
    }
}
