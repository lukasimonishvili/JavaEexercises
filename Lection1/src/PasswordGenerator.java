import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordGenerator {
    Scanner scanner = new Scanner(System.in);

    private String PasswordMaker(int length, Boolean isSpecialIncluded) {
        SecureRandom random = new SecureRandom();
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialCharacters = "!@#$%^&*()-_+=<>?";
        String[] charList = {uppercase, lowerCase, numbers, specialCharacters};

        String result = "";

        if(isSpecialIncluded) {
            result += specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        };

        result += uppercase.charAt(random.nextInt(uppercase.length()));
        result += lowerCase.charAt(random.nextInt(lowerCase.length()));
        result += numbers.charAt(random.nextInt(numbers.length()));

        while(result.length() < length) {
            String type = charList[random.nextInt(isSpecialIncluded ? charList.length : charList.length - 1)];
            result += type.charAt(random.nextInt(type.length()));
        }

        return result;
    }

    public void GeneratePassword() {
        System.out.println("Enter length of password - minimum 6 characters");
        int passwordLength = scanner.nextInt();
        if(passwordLength < 6) {
            System.out.println("Invalid character length");
            return;
        }
        System.out.println("Do you want special symbols in password? type yes/no");
        String specialSymbols = scanner.next();
        if(specialSymbols.equals("yes") || specialSymbols.equals("no")) {
            boolean isSpeacialIncluded = specialSymbols.equals("yes");
            String password = PasswordMaker(passwordLength, isSpeacialIncluded);
            System.out.println("password is: " + password);
        }else {
            System.out.println("Invalid response");
        }
    }

    public void testPasswordGenerator() {
        String passwordWithSpecial = PasswordMaker(8, true);
        String passwordWithoutSpecial = PasswordMaker(8, false);

        if(!passwordWithoutSpecial.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
            System.out.println("Test failed: generated password doesn't match requirements");
            return;
        }else if(!passwordWithSpecial.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\\\\-_=+<>?]).+$")) {
            System.out.println("Test failed: generated password doesn't match requirements - speacial");
            return;
        }

        System.out.println("All test passed. password generated correctly");
    }
}
