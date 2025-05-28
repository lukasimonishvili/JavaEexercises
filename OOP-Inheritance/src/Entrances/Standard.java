package Entrances;

public class Standard extends Entrance{

    public Standard(String name, double price){
        super(name, price);
    }

    public double calculatePrice() {
        return this.price;
    }
}
