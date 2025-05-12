import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void sumOfTwoNumber(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void primeNumber() {
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Please enter you number");
        Boolean result = true;
        int number = userNumber.nextInt();
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
                }
            }
        }
        String isOrNot = result ? "" : "not";
        System.out.println(number + " is " + isOrNot + " a prime number");
    }
    public static void fizzBuzz(int number) {
        String result = "";
        for(int i = 1; i <= number; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                result += "FIzzBuzz";
            }else if(i % 3 == 0){
                result += "Fizz";
            }else if(i % 5 == 0) {
                result += "Buzz";
            }else {
                result += i;
            }

            if(i != number) {
                result += ", ";
            }

        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        helloWorld();
        sumOfTwoNumber(20, 10);
        fizzBuzz(17);
        primeNumber();
    }
}