package Vehicles;

public class Garage {
    private final Car bmw = new Car("bmw", 2020);
    private final Bike harleyDavidson = new Bike("HarleyDavidson", 2019);
    private final Bicycle bmx = new Bicycle("bmx", 2005);
    private final Vehicle[] vehicles = new Vehicle[]{bmw, harleyDavidson, bmx};

    public void startAllVehicles() {
        for(Vehicle vehicle : vehicles) {
            vehicle.startUp();
            vehicle.stop();
        }
    }
}
