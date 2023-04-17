public class Vehicle {

//    TODO: mini-exercise Create a Vehicle class with two properties: a name
//     instance variable and a makeNoise() method. The instance variable should
//     be private and have getters and setters (in IntelliJ try cmd-N). The
//     makeNoise method should just sout out a typical vehicle noise. Then
//     create a more specific vehicle subclass, such as Motorcycle, Car, Truck,
//     Tractor, whatever. Make the specific vehicle class extend the Vehicle
//     class. Otherwise, keep it empty. Create a test class, perhaps calling it
//     VehicleTest. Instantiate the specific vehicle, assign a value to the
//     name property and run the methods on the specific vehicle. Notice the
//     inherited method works and the inherited name property is assignable on
//     the subclass.

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void makeNoise() {
        System.out.println(this.name + ": vroom");
    }
    public void dashLight() {
        System.out.println(this.name + ": Check Engine ON");
    }

}


class Motorcycle extends Vehicle {
//    TODO: Create a method in the subclass of the Vehicle class that overrides
//     the superclass makeNoise method.

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ": bu bub bu bub ub b");
    }

//    TODO: Create a breakingDownNoise() method in the subclass. It should call
//     super.makeNoise() and then add a second sout that adds a second noise
//     after the first one.

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println(this.getName() + ": rrRRRR *pop*");
    }
}

class Car extends Vehicle {
    @Override
    public void makeNoise() {
        System.out.println(this.getName() + ": reeeeee");
    }

    public void breakingDownNoise() {
        System.out.println(this.getName() + ": plop plop plop");
    }
}


