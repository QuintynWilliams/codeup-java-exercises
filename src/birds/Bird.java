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

//  Constructor will break all subclasses
    public Bird(String name) {
        this.name = name;
    }
//  .˙. Use a no arg
//  Each time a SUBc runs the SUPERc will run FIRST
    public Bird(){
        System.out.println("New Bird, created");
    }
}


//Subclasses of Bird
class Quaker extends Bird {
//  SUBc uses the BIRD SUPERc to setName .˙. calls to name via getName
//  will be the value set to the Quaker SUBc
    public void makeNoise () {
//      SUPERc *noise*
        super.makeNoise();
//      SUBc *noise*
        System.out.printf("%s: *ca-caw*%n", this.getName());
    }
        public Quaker(){
        System.out.println("New Quaker, created");
    }
}

//Subclasses of Bird
class Finch extends Bird {
    //  SUBc uses the BIRD SUPERc to setName .˙. calls to name via getName
//  will be the value set to the Quaker SUBc
    public void makeNoise () {
//      SUPERc *noise*
        super.makeNoise();
//      SUBc *noise*
        System.out.printf("%s: *chirp chirp*%n", this.getName());
    }
        public Finch(){
        System.out.println("New Finch, created");
    }
}

//Subclasses of Bird
class Goose extends Bird {
    //  SUBc uses the BIRD SUPERc to setName .˙. calls to name via getName
//  will be the value set to the Quaker SUBc
    public void makeNoise () {
//      SUPERc *noise*
        super.makeNoise();
//      SUBc *noise*
        System.out.printf("%s: *qwak-wak*%n", this.getName());
    }
        public Goose(){
        System.out.println("New Goose, created");
    }
}
