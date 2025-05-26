package Zoo;

public class Zoo{
    private final Dog dog = new Dog("Jack", 2);
    private final Cat cat = new Cat("Conchita", 1);
    private final Bird bird = new Bird("Chico", 1);
    private final Animal[] animals = new Animal[]{dog, cat, bird};


    public void makeNoises() {
        for(Animal animal: animals){
            animal.makeNoise();
        }
    }
}
