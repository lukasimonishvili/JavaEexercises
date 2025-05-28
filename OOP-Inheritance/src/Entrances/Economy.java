package Entrances;

public class Economy extends Entrance{
    private final double discount;

    public Economy(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public double calculatePrice() {
        return this.price * discount;
    }
}
