package Pets;

public class Pet {
    protected final String name;
    protected int energy = 5;
    protected int happiness = 5;

    public Pet(String name) {
        this.name = name;
    }

    protected void eat() {
        this.energy += 1;
        System.out.println(this.name + " is well fed and has more energy");
    }

    protected void play() {
        if(this.energy <= 1) {
            System.out.println("Not enough energy " + this.name + " needs to eat first");
            return;
        }
        this.energy -= 1;
        this.happiness += 1;
        System.out.println(this.name + " is happier but little bit more tired");
    }

    protected void showState() {
        System.out.println("State of " + this.name);
        System.out.println("energy - " + this.energy);
        System.out.println("happiness - " + this.happiness);
    }
}
