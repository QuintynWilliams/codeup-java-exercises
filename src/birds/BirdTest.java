package birds;

public class BirdTest {

    public static void main(String[] args) {

//      Since no constructor exists, name cant go inside paranthesis
        Quaker quaker = new Quaker();
        quaker.setName("Quaker");

//      Uses Subclass makeNoise function IOT:
//      QuakerClass: CAW rather than BirdClass: Tweet
        quaker.makeNoise();

//      Still may utilize superclass (BirdClass) method
        quaker.layEgg();

    }

}