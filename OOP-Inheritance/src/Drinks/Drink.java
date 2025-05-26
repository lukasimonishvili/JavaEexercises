package Drinks;

public abstract class Drink {
    protected String name;
    protected String size;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public abstract void getDescription();
}
