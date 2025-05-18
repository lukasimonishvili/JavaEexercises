public class AdvancedPolindrome extends Palindrome {

    public Boolean advancedPolindrome(String input) {
        String trimmedText = input.replaceAll("[^A-Za-z]", "").toLowerCase();
        Boolean result = palidnrome(trimmedText);
        System.out.println(result);
        return result;
    }
}
