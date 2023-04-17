package birds;

public class BirdTest {

    public static void main(String[] args) {

//      Since no constructor exists, name cant go inside paranthesis
//        Quaker quaker = new Quaker();
//        quaker.setName("Quaker");
//        Bird parakeet = new Bird();
//        parakeet.setName("Parakeet");

//      Uses Subclass makeNoise function IOT:
//      QuakerClass: CAW rather than BirdClass: Tweet
//        quaker.makeNoise();
//        parakeet.makeNoise();

//      Still may utilize superclass (BirdClass) method
//        quaker.layEgg();
//        parakeet.layEgg();

        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Zoo's Finch");
        birds[1] = new Goose();
        birds[1].setName("Zoo's Goose");
        birds[2] = new Quaker();
        birds[2].setName("Zoo's Quaker");

        for (Bird bird: birds) {
            bird.makeNoise();
        }

    }

}
