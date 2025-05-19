public class AdvancedPolindrome extends Palindrome {

    public Boolean advancedPolindrome(String input) {
        String modInput = input.toLowerCase();
        modInput = modInput.replaceAll("á", "a");
        modInput = modInput.replaceAll("é", "e");
        modInput = modInput.replaceAll("í", "i");
        modInput = modInput.replaceAll("ó", "o");
        modInput = modInput.replaceAll("ú", "u");
        modInput = modInput.replaceAll("[^A-Za-z]", "");

        Boolean result = palidnrome(modInput);
        System.out.println(result);
        return result;
    }
}
