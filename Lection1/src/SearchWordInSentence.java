import java.util.Scanner;

public class SearchWordInSentence {
    private int wordSearcher(String sentence, String word) {
        return sentence.indexOf(word);
    }

    public void searchWordInSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter sentence");
        String sentence = scanner.nextLine();
        System.out.println("Please enter word to search");
        String word = scanner.next();
        int result = wordSearcher(sentence, word);
        if(result < 0) {
            System.out.println("word not found");
        }else {
            System.out.println("word found at index " + result);
        }
    }

    public void testWordFinder() {
        if(wordSearcher("hello world my friend", "my") != 12) {
            System.err.println("Test failed. word search failure");
            return;
        }

        if(wordSearcher("hello world my friend", "hello") != 0) {
            System.err.println("Test failed. word search failure 1 ");
            return;
        }

        if(wordSearcher("hello world my friend", "friend") != 15) {
            System.err.println("Test failed. word search failure 2");
            return;
        }
        System.out.println("All tests passed");
    }
}
