package OOP_notes_by_rpg;

public class Fighter {

//  Fighter.Attributes
    private String name;
    private int hitPoints = 14;
    private int maxDamage = 10;
//                          ^Default values see below and fighter4
//    Static Method unchangeable and apply to ALL objects of the Class Fighter
    public static int armorClass = 15;

//  All fighters have access >
    public static int totalFighters;

//  Fighter.METHODS

//  Keep GET/SET Public
//  CMD+N generate getter and setter
    public void setName(String name) {
        this.name = name;
    }
    public void setHitPoints(int hp) {
        this.hitPoints = hp;
    }
    public void setMaxDamage(int dam) {
        this.maxDamage = dam;
    }
    public void printStats() {
        System.out.printf("""
               == %s \s
                   HP  |  DMG  |  Armor  \s
                   %d     %d       %d    \s
                   
                """,
                name, hitPoints, maxDamage, armorClass);
    }

//  Overloaded Constructor, no default constructor
// YOU must provide all Constructors && no arg constructor
    public Fighter () {
        totalFighters++;
    }
    public Fighter(String name, int hitPoints, int maxDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }

    public Fighter (String name) {
        this.name = name;
    }

}
