package Entrances;

public abstract class Entrance {
    protected final String name;
    protected final double price;

    public Entrance(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();
}
