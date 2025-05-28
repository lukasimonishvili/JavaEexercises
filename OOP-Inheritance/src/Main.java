import Drinks.DrinkMenu;
import Entrances.EventSeller;
import Pets.VirtualPetGame;
import Recipes.CookingBook;
import School.School;
import Vehicles.Garage;
import Zoo.Zoo;

public class Main {
    public static Zoo zoo = new Zoo();
    public static DrinkMenu drinkMenu = new DrinkMenu();
    public static Garage garage = new Garage();
    public static School school = new School();
    public static VirtualPetGame virtualPetGame = new VirtualPetGame();
    public static EventSeller eventSeller = new EventSeller();
    public static CookingBook cookingBook = new CookingBook();

    public static void main(String[] args) {
        zoo.makeNoises();
        drinkMenu.getDescriptions();
        garage.startAllVehicles();
        school.displaySchoolMembers();
        virtualPetGame.interactWithPets();
        eventSeller.logAllEvents();
        cookingBook.showAllRecipeSummary();
        cookingBook.showAllRecipeDescription();
    }
}

