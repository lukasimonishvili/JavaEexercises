package Recipes;

public abstract class Recipe {
    protected final String name;
    protected final Ingredient[] ingredients;
    protected final String[] steps;
    protected final String type;

    public Recipe(String name, Ingredient[] ingredients, String[] steps, String type){
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.type = type;
    }

    public void logSummary() {
        System.out.println("this recipe is " + this.type + " type. name of this dish is "
                + this.name + " and it needs " + this.ingredients.length + " ingredients"
        );
    }

    public abstract void logDescription();
}
