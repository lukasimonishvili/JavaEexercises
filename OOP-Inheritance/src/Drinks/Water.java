package Drinks;

public class Water extends Drink{
    private final boolean withMineral;

    public Water(String name, String size, boolean withMineral) {
        super(name, size);
        this.withMineral = withMineral;
    }

    public void getDescription() {
        String mineralDescription = this.withMineral ? "with" : "without";
        System.out.println(this.name + " is a water with a " + this.size + " size and " + mineralDescription + " minerals");
    }
}
