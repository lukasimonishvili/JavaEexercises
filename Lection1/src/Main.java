//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Factorial factorial = new Factorial();
    public static Palindrome palindrome = new Palindrome();
    public static  Vowels vowels = new Vowels();
    public static GreatestMember greatestMember = new GreatestMember();

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
    }
}