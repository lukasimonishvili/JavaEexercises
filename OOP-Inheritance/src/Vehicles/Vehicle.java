package Vehicles;

public abstract class Vehicle {
    protected final String mark;
    protected final int year;

    public Vehicle(String mark, int year) {
        this.mark = mark;
        this.year = year;
    }

    public abstract void startUp();

    public void stop() {
        System.out.println("vehicle stoped");
    }
}
