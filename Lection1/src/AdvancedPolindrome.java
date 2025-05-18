public class AdvancedPolindrome extends Palindrome {

    public Boolean advancedPolindrome(String input) {
        String trimmedText = input.replaceAll("[^A-Za-z]", "").toLowerCase();
        return palidnrome(trimmedText);
    }
}
