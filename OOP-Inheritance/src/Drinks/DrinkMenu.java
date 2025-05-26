package Drinks;

public class DrinkMenu {
    private final Soda cola = new Soda("Coca-cola", "medium", true);
    private final Juice cocktail = new Juice("cocktail", "large", "orange and mango");
    private final Water vichy = new Water("Vichy", "small", true);
    private final Drink[] drinks = new Drink[]{cola, cocktail, vichy};

    public void getDescriptions() {
        for(Drink drink: drinks) {
            drink.getDescription();
        }
    }
}
