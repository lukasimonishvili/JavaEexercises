public class AdvancedPolindrome extends Palindrome {

    public Boolean advancedPolindrome(String input) {
        String modInput = input.toLowerCase();
        if(modInput.contains("á")) modInput = modInput.replaceAll("á", "a");
        if(modInput.contains("é")) modInput = modInput.replaceAll("é", "e");
        if(modInput.contains("í")) modInput = modInput.replaceAll("í", "i");
        if(modInput.contains("ó")) modInput = modInput.replaceAll("ó", "o");
        if(modInput.contains("ú")) modInput = modInput.replaceAll("ú", "u");
        modInput = modInput.replaceAll("[^A-Za-z]", "");

        Boolean result = palidnrome(modInput);
        System.out.println(result);
        return result;
    }
}
