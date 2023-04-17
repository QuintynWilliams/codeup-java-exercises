package birds;

public class Bird {
    private String name;

//  GET && SET
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//  Generic Method
    public void makeNoise ()  {
        System.out.printf("%s: *tweet, tweet*%n", this.name);
    }

    public void layEgg(){
        System.out.printf("%s: *lays egg*%n", this.name);
    }

}

class Quaker extends Bird {
//  SUBc uses the BIRD SUPERc to setName .˙. calls to name via getName
//  will be the value set to the Quaker SUBc
    public void makeNoise () {
//      SUPERc *noise*
        super.makeNoise();
//      SUBc *noise*
        System.out.printf("%s: *ca-caw*%n", this.getName());
    }
}
