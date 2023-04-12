package OOP_animal;

public class owl {
//  POJO: Plain Old Java Object
    private String name;
    private String sound;

//    CMD+N generate getter and setter
    public void setName(String name) {
         this.name = name;
    }

    public void setSound(String sound) {
         this.sound = sound;
    }

    public void makeNoise() {
        System.out.printf("%s goes %s\n", name, sound);
    }
}
