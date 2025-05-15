import java.util.HashMap;

public class Vowels {
    public int vowels(String text) {
        String textLoweCase = text.toLowerCase();
        String charList = "aeiouy";
        HashMap<Character, Integer> counter = new HashMap<>();
        int totalVowels = 0;
        String result = "";

        for(int i = 0; i < textLoweCase.length(); i++) {
            Character character = textLoweCase.charAt(i);
            if(charList.indexOf(character) > -1) {
                if(counter.containsKey(character)) {
                    counter.put(character, counter.get(character) + 1);
                }else {
                    counter.put(character, 1);
                }
                totalVowels++;
            }
        }

        for(Character key : counter.keySet()) {
            result += key + ":" + counter.get(key) + " - ";
        }

        result += "total:" + totalVowels;
        System.out.println(result);
        return totalVowels;
    }

    private Boolean assertEquals(String text, int expected) {
        return  expected == vowels(text);
    }

    public void testVowels() {
        String test1 = "Hello World";
        if(!assertEquals(test1, 3)) {
            System.err.println("Test failed: Wrong vowel count");
            return;
        }

        String test2 = "Hola mundo";
        if(!assertEquals(test2, 4)) {
            System.err.println("Test failed: Wrong vowel count");
            return;
        }

        String test3 = "Java is fun";
        if(!assertEquals(test3, 4)) {
            System.err.println("Test failed: Wrong vowel count");
            return;
        }

        System.out.println("all test passed");
    }
}
