import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {
    private int Add(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("result: " + result);
        return  result;
    }

    private int Decrease(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("result: " + result);
        return  result;
    }

    private int Multiply(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("result: " + result);
        return  result;
    }

    private int Divide(int number1, int number2) {
        int result = number1 / number2;
        System.out.println("result: " + result);
        return  result;
    }

    public void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("please type operation from following symbols: + - * /");
        char operation = scanner.next().charAt(0);

        System.out.println("please input second number");
        int secondNumber = scanner.nextInt();

        switch (operation) {
            case '+':
                Add(firstNumber, secondNumber);
                break;
            case '-':
                Decrease(firstNumber, secondNumber);
                break;
            case '*':
                Multiply(firstNumber, secondNumber);
                break;
            case '/':
                if(firstNumber == 0 || secondNumber == 0) {
                    System.err.println("Divide on/by 0 is forbidden");
                }else {
                    Divide(firstNumber, secondNumber);
                }
                break;
            default:
                System.err.println("Unknown operation detected");
                break;
        }
    }

    private Boolean assertEquals(int number1, int number2, int expected, BiFunction<Integer, Integer, Integer> cb){
        return expected == cb.apply(number1, number2);
    }

    public void testCalculator() {
        if(!assertEquals(1, 3, 4, this::Add)) {
            System.err.println("Test failed. Add doesn't work");
        }

        if(!assertEquals(5, 2, 3, this::Decrease)) {
            System.err.println("Test failed. Decrease doesn't work");
        }

        if(!assertEquals(3, 2, 6, this::Multiply)) {
            System.err.println("Test failed. Add doesn't work");
        }

        if(!assertEquals(6, 2, 3, this::Divide)) {
            System.err.println("Test failed. Add doesn't work");
        }

        System.out.println("All test passed. calculator works");
    }
}
