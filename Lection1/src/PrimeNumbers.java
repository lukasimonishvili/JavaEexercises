import java.util.Scanner;

public class PrimeNumbers {

    private Boolean isPrimeNumber(int number) {
        Boolean result = true;
        if(number <= 1) {
            result = false;
        }else if (number == 2){
            result = true;
        }else if(number % 2 == 0) {
            result = false;
        }else {
            for(int i = 3; i <= Math.sqrt(number); i += 2) {
                if(number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private String primeNumbers(int firsNumber, int secondNumber) {
        String result = "";

        for(int i = firsNumber; i <= secondNumber; i++) {
            if(isPrimeNumber(i)) {
                result += i + ", ";
            }
        }

        if(!result.isEmpty()) result = result.substring(0, result.length() - 2);
        return result;
    }

    public void primeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();

        String result = primeNumbers(firstNumber, secondNumber);
        if(result.isEmpty()){
            System.out.println("No prime numbers found");
        }else{
            System.out.println("Prime numbers between " + firstNumber + " and " + secondNumber + ": " + result);
        }
    }

    public void testPirmeNumber() {
        if(!primeNumbers(10, 20).equals("11, 13, 17, 19")){
            System.err.println("test failed. prime numbers searched incorrectly");
            return;
        }

        if(!primeNumbers(1, 30).equals("2, 3, 5, 7, 11, 13, 17, 19, 23, 29")){
            System.err.println("test failed. prime numbers searched incorrectly");
            return;
        }

        if(!primeNumbers(55, 120).equals("59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113")){
            System.err.println("test failed. prime numbers searched incorrectly");
            return;
        }

        System.out.println("All tests passed");
    }
}
