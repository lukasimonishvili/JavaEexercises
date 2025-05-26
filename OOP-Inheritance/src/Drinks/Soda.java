package Drinks;

public class Soda extends Drink{
    private final boolean hasGas;

    public Soda(String name, String size, boolean hasGas) {
        super(name, size);
        this.hasGas = hasGas;
    }

    public void getDescription() {
        String gasDescription = this.hasGas ? "with" : "without";
        System.out.println(this.name + " is a soda with a " + this.size + " size and " + gasDescription + " gas");
    }
}
