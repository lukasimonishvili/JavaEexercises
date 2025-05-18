import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextAnalyser extends AdvancedPolindrome{
    private String analise(String input, Boolean doLog) throws IOException {
        String[] stringArr = input.trim().split(" ");
        String longestWord = stringArr[0];
        for(int i = 0; i < stringArr.length; i++) {
            if(longestWord.length() < stringArr[i].length()) longestWord = stringArr[i];
        }
        String result = "Input - " + input;
        result += "\n Characters - " + input.length();
        result += "\n Words - " + stringArr.length;
        result += "\n Longest word - " + longestWord;
        result += "\n Vowels - " + vowels(input);
        result += "\n Polindrome - " + advancedPolindrome(input) + "\n \n";

        if(doLog) {
            try{
                File file = new File("log.txt");

                if(!file.exists()) {
                    file.createNewFile();
                }

                FileWriter writer = new FileWriter(file, true);
                writer.write(result);
                writer.close();
            }catch (IOException e) {
                System.out.println("An error occurred while writing to file.");
                e.printStackTrace();
            }
        }
        return result;
    }

    public void textAnalyser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text to analise");
        String input = scanner.nextLine();
        System.out.println("Do you want to log this in txt file? yes/no");
        String doLog = scanner.next();

        String result = analise(input, doLog.equals("yes"));
        System.out.println(result);
    }
}
