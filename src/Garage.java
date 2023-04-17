public class Garage {
//  default && protected enables access only by within the related classes
    protected Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void alarmCascade() {
        for (Vehicle vehicle: this.vehicles) {
            vehicle.makeNoise();
        }
    }

}
