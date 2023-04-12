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
}
