public class VehicleTest {
    //  Here for Brevity Vehicle Class Test
    public static void main(String[] args) {
//      constructs a new Vehicle class, gets the default methods
//        Vehicle gasWagon = new Vehicle();
//        gasWagon.setName("gasWagon");
//        gasWagon.makeNoise();

//      constrcuts a new Motorcycle SUB class, with a unique method
//      makeNoise is an OVERride of VEHICLE's method, not entirely unique
//        Motorcycle harleyDave = new Motorcycle();
//        harleyDave.setName("harleyDave");
//        Car issaNissan = new Car ();
//        issaNissan.setName("issaNissan");

//      SUBClass still has access to the SUPERClass methods
//        harleyDave.dashLight();
//        harleyDave.breakingDownNoise();
//        issaNissan.dashLight();
//        issaNissan.breakingDownNoise();

//      Arrays && sub/super classes
//        Vehicle[] carLot = new Vehicle[3];
//        carLot[0] = new Motorcycle();
//        carLot[0].setName("Triumph Horse");
//        carLot[1] = new Car();
//        carLot[1].setName("Car RamRod");
//        carLot[2] = new Vehicle();
//        carLot[2].setName("Oregon Wagon");

        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Motorcycle();
        garage.vehicles[0].setName("Two-Wheel Tom");
        garage.vehicles[1] = new Car();
        garage.vehicles[1].setName("Four-Wheel Frank");
        garage.vehicles[2] = new Vehicle();
        garage.vehicles[2].setName("Vroom-Vroom Vicky");

        garage.alarmCascade();

    }

}
