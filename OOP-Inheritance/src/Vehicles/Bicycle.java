package Vehicles;

public class Bicycle extends Vehicle{

    public Bicycle(String mark, int year) {
        super(mark, year);
    }

    @Override
    public void startUp() {
        System.out.println("No need to start up");
    }
}
