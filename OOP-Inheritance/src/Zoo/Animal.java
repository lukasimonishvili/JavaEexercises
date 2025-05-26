package Zoo;

public abstract class Animal {
    protected String name;
    protected int age;

    abstract void makeNoise();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

