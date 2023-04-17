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

    public static void main(String[] args) {
        Motorcycle bob = new Motorcycle();
        bob.makeNoise();

    }

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise () {
        System.out.println("vroom");
    }

}

class Motorcycle extends Vehicle {
    @Override
    public void makeNoise() {
        System.out.println("bu bub bu bub ub b");;
    }
}

class Car extends Vehicle {
    @Override
    public void makeNoise() {
        System.out.println("reeeeee");;
    }
}

class Truck extends Vehicle {
    @Override
    public void makeNoise() {
        System.out.println("Grgrgrggr");;
    }
}



