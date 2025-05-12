//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

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
        fizzBuzz(17);
    }
}