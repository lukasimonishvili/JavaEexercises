package Zoo;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeNoise() {
        System.out.println("¡Pío pío!");
    }
}
