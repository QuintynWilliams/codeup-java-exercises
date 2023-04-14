package OOP_notes_by_rpg;

public class Monster {
//  Not the actual object, Rather TRAIT of one when to be created
    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

//  GET && SET  {CMD+N}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getArmorClass() {
        return armorClass;
    }
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

//  Constructors  {CMD+N}
    public Monster() {
    }   // No-Arg
    public Monster(String name, int armorClass, int hitPoints, int damage) {
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }



}
