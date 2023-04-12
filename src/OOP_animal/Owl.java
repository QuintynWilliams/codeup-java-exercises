package OOP_animal;

public class Owl {
//  POJO: Plain Old Java Object
//  Keep Properties Private
    private String name;
    private String sound;

//  Keep GET/SET Public
//  CMD+N generate getter and setter
    public void setName(String name) {
         this.name = name;
    }
    public void setSound(String sound) {
         this.sound = sound;
    }
    public void makeNoise() {
        System.out.printf("%s says, \"%s.\"\n", name, sound);
    }

    public Owl () {

    }
    public Owl(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public static String randomQuote() {
        int getQuote = (int)(Math.random()*4)+1;
        return switch (getQuote) {
            case 1 -> "Opportunities don't happen, you create them";
            case 2 -> "It is never too late to be what you might have been";
            case 3 -> "The road to success and to failure are the same path";
            case 4 -> "Don’t let yesterday take up too much of today";
            default -> "--silence--";
        };
    }

}
