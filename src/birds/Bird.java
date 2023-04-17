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
    public String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise () {
        System.out.printf("%s: *ca-caw*%n", this.name);
    }

}
