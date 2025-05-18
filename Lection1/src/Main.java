//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Factorial factorial = new Factorial();
    public static Palindrome palindrome = new Palindrome();
    public static Vowels vowels = new Vowels();
    public static GreatestMember greatestMember = new GreatestMember();
    public static InvertArray invertArray = new InvertArray();
    public static SortArray sortArray = new SortArray();
    public static Calculator calculator = new Calculator();
    public static PasswordGenerator passwordGenerator = new PasswordGenerator();
    public static AdvancedCalculator advancedCalculator = new AdvancedCalculator();
    public static AdvancedPolindrome advancedPolindrome = new AdvancedPolindrome();
    public static WordCounter wordCounter = new WordCounter();
    public static CharacterReplacer characterReplacer = new CharacterReplacer();

    public static void main(String[] args) {

        int factorialNumber = factorial.factorial(5);
        System.out.println(factorialNumber);
        factorial.testFactorial();

        palindrome.palidnrome("lukakul");
        palindrome.testPalindrome();

        vowels.vowels("what`s up my man");
        vowels.testVowels();

        greatestMember.greatestMember(new int[]{1, 7, 22, 8, 9, 12, 23, 66, 109, 12, 0});
        greatestMember.testGreatestMember();

        invertArray.invertArray(new int[]{1,2,3,4,5,6, 7});
        invertArray.testInvertArray();

        sortArray.sortArray(new int[]{5,1,23,55,-1,8,3, 22, 19, 0});
        sortArray.testSortArray();

        calculator.calculator();
        calculator.testCalculator();

        passwordGenerator.GeneratePassword();
        passwordGenerator.testPasswordGenerator();

        advancedCalculator.calculator();
        advancedCalculator.testCalculator();

        advancedPolindrome.advancedPolindrome("la ruta natuRaL");

        wordCounter.wordCounter();
        wordCounter.testWordCounter();

        characterReplacer.characterReplacer();
        characterReplacer.testReplacer();
    }
}