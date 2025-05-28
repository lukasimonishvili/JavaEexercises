package Recipes;

public class CookingBook {
    private Ingredient[] cookieIngredients = new Ingredient[]{
            new Ingredient("butter", 0.5, "cup"),
            new Ingredient("Sugar", 2, "cup"),
            new Ingredient("unsweetened cocoa powder", 0.25, "cup"),
            new Ingredient("milk", 0.5, "cup"),
            new Ingredient("peanut butter", 0.5, "cup"),
            new Ingredient("vanilla extract", 1, "tea spoon"),
            new Ingredient("quick oats", 3, "cup")
    };
    private String[] cookieSteps = new String[]{
            "in a saucepan over medium heat, combine: butter, sugar, milk, cocoa powder",
            "stir constantly until mixture comes to a boil. Let it boil for 1 minute",
            "remove from heat and stir in: peanut butter, vanilla extract, oats",
            "drop spoonful of mixture onto wax paper or a baking sheet",
            "let cool for about 20-30 minutes until firm"
    };
    private SweetRecipe ChocolateoatmealCookie = new SweetRecipe("Chocolate oatmeal cookie", cookieIngredients, cookieSteps, "sweet");

    private Ingredient[] pastaIngredients = new Ingredient[]{
            new Ingredient("pasta", 200, "gram"),
            new Ingredient("butter", 3, "table spoon"),
            new Ingredient("garlic", 3, "cloves"),
            new Ingredient("salt", 1, "tea spoon"),
            new Ingredient("black paper", 1, "tea spoon"),
            new Ingredient("fresh parsley", 1, "gram"),
            new Ingredient("Grated parmesan cheese", 10, "gram")
    };

    private String[] pastaSteps = new String[]{
            "Boil the pasta in salted water according to package instructions. Drain and set aside (save a little pasta water, just in case)",
            "In a large pan, melt the butter over medium heat",
            "Add the minced garlic and sauté for about 1–2 minutes, until fragrant (don’t burn it)",
            "Add the cooked pasta to the pan. Toss to coat with the garlic butter.",
            "Season with salt and pepper to taste. Add a splash of pasta water if it feels too dry.",
            "sprinkle with chopped parsley and Parmesan cheese before serving."
    };

    private SaltyRecipe garlicButterPasta = new SaltyRecipe("garlic butter pasta", pastaIngredients, pastaSteps, "salty");

    public void showAllRecipeSummary() {
        ChocolateoatmealCookie.logSummary();
        garlicButterPasta.logSummary();
    }

    public void showAllRecipeDescription() {
        ChocolateoatmealCookie.logDescription();
        garlicButterPasta.logDescription();
    }
}
