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
        System.out.println("vroom");
    }
    public void dashLight() {
        System.out.println("Check Engine light: ON");
    }

//  Here for Brevity
    public static void main(String[] args) {
//      constructs a new Vehicle class, gets the default methods
        Vehicle sumCar = new Vehicle();
        sumCar.makeNoise();

//      constrcuts a new Motorcycle SUB class, with a unique method
//      makeNoise is an OVERride of VEHICLE's method, not entirely unique
        Motorcycle harleyDave = new Motorcycle();
        harleyDave.makeNoise();

//      SUBClass still has access to the SUPERClass methods
        harleyDave.dashLight();

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



