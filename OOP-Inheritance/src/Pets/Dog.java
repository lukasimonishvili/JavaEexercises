package Pets;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void play() {
        if(this.energy <= 1) {
            System.out.println("Not enough energy " + this.name + " needs to eat first");
            return;
        }
        this.happiness += 2;
        this.energy -= 1;
        System.out.println(this.name + " is happier but little bit more tired");
    }
}

