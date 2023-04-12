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
        System.out.printf("%s goes %s.\n", name, sound);
    }

    public Owl () {

    }
    public Owl(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public static String randomQuote() {
        int getQuote = (int)(Math.random()*4)+1;
        String quote = "";
        if (getQuote == 1) {
            quote = "Meow";
        } else if (getQuote == 2) {
            quote = "Bark";
        } else if (getQuote == 3) {
            quote = "Screech";
        } else if (getQuote == 4) {
            quote = "Hi";
        }
        return quote;
    }
}
