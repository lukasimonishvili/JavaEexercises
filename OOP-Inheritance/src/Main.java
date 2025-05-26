import Drinks.DrinkMenu;
import Zoo.Zoo;

public class Main {
    public static Zoo zoo = new Zoo();
    public static DrinkMenu drinkMenu = new DrinkMenu();

    public static void main(String[] args) {
        zoo.makeNoises();
        drinkMenu.getDescriptions();
    }
}

