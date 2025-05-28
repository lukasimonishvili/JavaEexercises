package Entrances;

public class Vip extends Entrance{
    private final double fee;

    public Vip(String name, double price, double fee) {
        super(name, price);
        this.fee = fee;
    }

    public double calculatePrice() {
        return this.price + (this.price * this.fee);
    }
}
