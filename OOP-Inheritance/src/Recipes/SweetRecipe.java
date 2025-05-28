package Recipes;

public class SweetRecipe extends Recipe{
    public SweetRecipe(String name, Ingredient[] ingredients, String[] steps, String type) {
        super(name, ingredients, steps, type);
    }

    public void logDescription() {
        System.out.println("this is step by step guide how to prepare this sweet recipe");
        System.out.println("Ingredient list:");
        for(int i = 0; i < this.ingredients.length; i++) {
            System.out.println((i+1) + ") " + this.ingredients[i].name + " " + this.ingredients[i].amount + this.ingredients[i].unit);
        }
        System.out.println("Steps to follow:");
        for(int i = 0; i < this.steps.length; i++) {
            System.out.println((i+1) + ") " + this.steps[i]);
        }
        System.out.println("happy cooking");
    }
}
