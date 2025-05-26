package Vehicles;

public class Bike extends Vehicle{

    public Bike(String mark, int year){
        super(mark, year);
    }

    public void startUp() {
        System.out.println("bike is ready to ride");
    }
}
