import java.util.Scanner;

public class Calculator {
    private String numberParser(int index, String input, String operation) {
        String left = "";
        String right = "";

        for (int i = index + 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.toString(ch).matches("[0-9.]")) {
                right += ch;
            } else if (ch == '-' && right.isEmpty()) {
                right += ch;
            } else {
                break;
            }
        }

        for (int i = index - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (Character.toString(ch).matches("[0-9.]")) {
                left = ch + left;
            } else if (ch == '-' && (i == 0 || "+-*/(".contains("" + input.charAt(i - 1)))) {
                left = ch + left;
                break;
            } else {
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
        while (input.contains("(")) {
            int left = input.indexOf("(");
            int right = -1;
            int nestedBracketCount = 0;
            for (int i = left + 1; i < input.length(); i++) {
                if (input.charAt(i) == '(') {
                    nestedBracketCount++;
                } else if (input.charAt(i) == ')' && nestedBracketCount > 0) {
                    nestedBracketCount--;
                } else if (input.charAt(i) == ')' && nestedBracketCount == 0) {
                    right = i + 1;
                    break;
                }
            }

            String subString = input.substring(left, right);
            input = input.replace(subString, Double.toString(calculate(input.substring(left + 1, right - 1))));
        }

        while (!input.matches("^-?[0-9.]+$")) {
            if (input.contains("*")) {
                input = numberParser(input.indexOf("*"), input, "*");
            } else if (input.contains("/")) {
                input = numberParser(input.indexOf("/"), input, "/");
            } else if (input.contains("+")) {
                input = numberParser(input.indexOf("+"), input, "+");
            } else if (input.contains("-")) {
                int minusIndex = input.indexOf("-", 1);
                if (minusIndex == -1) break;
                input = numberParser(minusIndex, input, "-");
            }
        }

        return Double.parseDouble(input);
    }

    public void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter math problem:");
        String input = scanner.nextLine();
        input = input.replaceAll(" ", "");
        System.out.println("Parsed input: " + input);
        double result = calculate(input);
        System.out.println("Answer is " + result);
    }
}
