package Vehicles;

public class Car extends Vehicle{

    public Car(String mark, int year){
        super(mark, year);
    }

    public void startUp() {
        System.out.println("Car is started up");
    }
}
