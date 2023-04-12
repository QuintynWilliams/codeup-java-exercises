package OOP_notes_by_rpg;

public class RPG {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter();
        fighter1.setName("Anita");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(16);
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Gojira");
        fighter2.setHitPoints(20);
        fighter2.setMaxDamage(11);
        fighter2.printStats();

        Fighter fighter3 = new Fighter ("Shrek", 95, 45);
        fighter3.printStats();

        Fighter fighter4 = new Fighter ("Therion");
        fighter4.printStats();

    }
}
