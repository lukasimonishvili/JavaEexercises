import Drinks.DrinkMenu;
import Vehicles.Garage;
import Zoo.Zoo;

public class Main {
    public static Zoo zoo = new Zoo();
    public static DrinkMenu drinkMenu = new DrinkMenu();
    public static Garage garage = new Garage();

    public static void main(String[] args) {
        zoo.makeNoises();
        drinkMenu.getDescriptions();
        garage.startAllVehicles();
    }
}

