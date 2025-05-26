package Pets;

import java.util.Scanner;

public class VirtualPetGame {
    private final Dog dog = new Dog("Hachico");
    private final Cat cat = new Cat("Sabrina");
    private final Hamster hamster = new Hamster("Ratattui");

    public void interactWithPets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select pet");
        System.out.println("1) Dog");
        System.out.println("2) cat");
        System.out.println("3) Hamster");
        System.out.println("or type 4 to exit");
        int petSelectInput = scanner.nextInt();
        if(petSelectInput == 4) return;
        System.out.println("Please select interaction");
        System.out.println("1) Play");
        System.out.println("2) Feed");
        System.out.println("3) Show state");
        System.out.println("or type 4 to exit");
        int interactionSelectInput = scanner.nextInt();
        if(interactionSelectInput == 4) return;
        Pet pet = petSelectInput == 1 ? dog : petSelectInput == 2 ? cat : hamster;
        switch (interactionSelectInput) {
            case 1:
                pet.play();
            break;
            case 2:
                pet.eat();
            break;
            case 3:
                pet.showState();
            break;
        }
        interactWithPets();
    }
}
