public class Pet {
    private String name;
    private String type;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Pet() {
    }

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String snuggle() {
        return this.name + " snuggled";
    }

}

class PetDog extends Pet implements Companion {
    boolean trained = false;

    public PetDog (String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }
}

interface Companion {
    String snuggle();
}
