import java.util.Scanner;

public class Calculator {
    private String numberParser(int index, String input, String operation) {
        String left = "";
        String right = "";


        for(int i = index - 1; i >= 0; i--) {
            if(Character.toString(input.charAt(i)).matches("^[0-9.]+$")){
                left = input.charAt(i) + left;
            }else {
                break;
            }
        }

        for(int i = index + 1; i < input.length(); i++) {
            if(Character.toString(input.charAt(i)).matches("^[0-9.]+$")){
                right += input.charAt(i);
            }else {
                break;
            }
        }
        Double leftDouble = Double.valueOf(left);
        Double rightDouble = Double.valueOf(right);
        double result = operation.equals("*") ? leftDouble * rightDouble :
                        operation.equals("/") ? leftDouble / rightDouble :
                        operation.equals("+") ? leftDouble + rightDouble :
                        leftDouble - rightDouble;

        return input.replace(left + operation + right, Double.toString(result));
    }

    private double calculate(String input) {
        while(input.contains("(")) {
            int left = input.indexOf("(");
            int right = -1;
            int nestedBracketCount = 0;
            for(int i = left + 1; i < input.length(); i++) {
                if(input.charAt(i) == '(') {
                    nestedBracketCount++;
                    continue;
                }

                if(input.charAt(i) == ')' && nestedBracketCount > 0) {
                    nestedBracketCount--;
                    continue;
                }

                if(input.charAt(i) == ')') {
                    right = i + 1;
                    break;
                }
            }

            String subString = input.substring(left, right);
            input = input.replace(subString, Double.toString(calculate(input.substring(left + 1, right - 1))));
        }

        while(!input.matches("^[0-9.]+$")){
            if(input.contains("*")) {
                input = numberParser(input.indexOf("*"), input, "*");
            } else if (input.contains("/")) {
                input = numberParser(input.indexOf("/"), input, "/");
            } else if (input.contains("+")) {
                input = numberParser(input.indexOf("+"), input, "+");
            } else if (input.contains("-")) {
                input = numberParser(input.indexOf("-"), input, "-");
            }
        }

        return Double.parseDouble(input);
    }



    public void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter math problem");
        //String input = scanner.nextLine();
        String input = "3.5 + 2.8 * (4 - 1.2  * 2) / 2 + (10 - 2)";
        input = input.replaceAll(" ", "");
        System.out.println(input);
        double result = calculate(input);
        System.out.println("Answer is " + result);
    }
}
