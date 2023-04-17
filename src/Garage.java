public class Garage {
    public Vehicle[] vehicles;

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
