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

    public void makeNoise ()  {
        System.out.println("*tweet, tweet*");
    }

}
