import java.util.Scanner;

public class CharacterReplacer {

    private String replacer(String input, String target, String replacer) {
        return input.replaceAll(target, replacer);
    }

    public void characterReplacer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your text");
        String input = scanner.nextLine();
        System.out.println("Please enter character you want to replace");
        String characterToReplace = scanner.next();
        System.out.println("please enter character you want to replace " + characterToReplace + " with");
        String replacer = scanner.next();
        String result = replacer(input, characterToReplace, replacer);
        System.out.println(result);
    }

    public void testReplacer() {
        if(!replacer("hello world", "l", "t").equals("hetto wortd")) {
            System.err.println("Test failed. characters replaced incorrectly");
            return;
        }

        if(!replacer("hello world", "h", "b").equals("bello world")) {
            System.err.println("Test failed. characters replaced incorrectly");
            return;
        }

        if(!replacer("hello world", "o", "q").equals("hellq wqrld")) {
            System.err.println("Test failed. characters replaced incorrectly");
            return;
        }

        System.out.println("All test passed");
    }
}
