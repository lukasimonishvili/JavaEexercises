import java.util.Scanner;

public class AdvancedCalculator {
    private double compute(String input) {
        String[] stringArray = input.trim().split(" ");
        double result = Integer.parseInt(stringArray[0]);
        int temp = 0;
        for(int i = 1; i < stringArray.length; i++){
            switch (stringArray[i]){
                case "power":
                    result = Math.pow(result, temp);
                break;
                case "sqrt":
                    result = Math.sqrt(result);
                break;
                case "mod":
                    result = result % temp;
                break;
                default:
                    temp = Integer.parseInt(stringArray[i]);
                break;
            }
        }
        return  result;
    }

    public void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your task e.g: 2 3 power 2 mod sqrt");
        String calculateString = scanner.nextLine();

        double result = compute(calculateString);
        System.out.println("result of your request is: " + result);
    }

    public void testCalculator() {
        if(compute("5 2 mod") != 1) {
            System.err.println("Test failed, wrong calculation");
            return;
        }

        if(compute("3 3 power") != 27) {
            System.err.println("Test failed, wrong calculation");
            return;
        }

        if(compute("25 sqrt") != 5) {
            System.err.println("Test failed, wrong calculation");
            return;
        }

        if(compute("25 5 plus") != 30) {
            System.err.println("Test failed, wrong calculation");
            return;
        }

        if(compute("25 5 minus") != 20) {
            System.err.println("Test failed, wrong calculation");
            return;
        }

        if(compute("5 5 times") != 5) {
            System.err.println("Test failed, wrong calculation");
            return;
        }

        if(compute("25 5 divide") != 5) {
            System.err.println("Test failed, wrong calculation");
            return;
        }

        System.out.println("All tests passed");
    }
}
