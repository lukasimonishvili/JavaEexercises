package Pets;

public class Hamster extends Pet{

    public Hamster(String name) {
        super(name);
    }

    @Override
    protected void play() {
        if(this.energy <= 2) {
            System.out.println("Not enough energy " + this.name + " needs to eat first");
            return;
        }
        this.energy -= 2;
        System.out.println(this.name + " is happier but little bit more tired");
    }
}
