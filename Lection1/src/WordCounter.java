import java.io.PrintStream;
import java.util.Scanner;

public class WordCounter {
    private String counter(String input) {
        String[] stringArray = input.trim().split(" ");
        String charList = "aeiouy";
        String result = "";
        int vowelCounter = 0;
        result += "words: " + stringArray.length;
        for(int i = 0; i < stringArray.length; i++) {
            if(charList.indexOf(stringArray[i].charAt(0)) > -1) vowelCounter++;
        }

        result += " vowels: " + vowelCounter;
        return result;
    }

    public void wordCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sentence");
        String sentence = scanner.nextLine();
        String result = counter(sentence);
        System.out.println(result);
    }

    public void testWordCounter() {
        if(!counter("hello world").equals("words: 2 vowels: 0")){
            System.out.println("Test failed. wrong word count");
            return;
        }

        if(!counter("if you are good at coding say yes").equals("words: 8 vowels: 5")){
            System.out.println("Test failed. wrong word count");
            return;
        }

        if(!counter("amount of words here is surprising").equals("words: 6 vowels: 3")){
            System.out.println("Test failed. wrong word count");
            return;
        }

        System.out.println("All tests passed");
    }
}
