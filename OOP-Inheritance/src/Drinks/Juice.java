package Drinks;

public class Juice extends Drink {
    private final String fruit;

    public Juice(String name, String size, String fruit) {
        super(name, size);
        this.fruit = fruit;
    }

    public void getDescription() {
        System.out.println(this.name + " is a juice with a " + this.size + " size and made with " + this.fruit);
    }
}
