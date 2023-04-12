package OOP_animal;

public class animal {
    public static void main(String[] args) {
//  Constructor: bring owl class to THIS class
//  Class v Object: Class is a bluebrint, Object is the Thing
//    Empty contact template is a Class, saved contact is the Object
//    barnOwl is an Instance of the class owl

//  TODO: Create a class for your favorite type of animal. The class should be
//   named for your animal - Cat, Dog, Parrot etc. It should have two instance
//   variables - name and sound - and one method - makeNoise(). The output of
//   the makeNoise method should be name + " goes " + sound. Create a test
//   class with a main method to instantiate and test your class code.

    owl barnowl = new owl();
    barnowl.setName("Barn Owl");
    barnowl.setSound("meow");
    barnowl.makeNoise();
    }
}
