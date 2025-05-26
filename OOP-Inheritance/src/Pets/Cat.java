package Pets;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        this.energy += 2;
        System.out.println(this.name + " is well fed and has more energy");
    }
}


