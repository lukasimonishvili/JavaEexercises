import java.util.Scanner;

public class Temperature {
    private String fromCelsius(double input) {
        double fahrenheit = (input * (9/5)) + 32;
        double kelvin = input + 273.17;
        return "fahrenheit: " + fahrenheit + " Kelvin " + kelvin;
    }

    private String fromFahrenheit(double input) {
        double celsius = (input - 32) * (5/9);
        double kelvin = celsius + 273.15;

        return "celsius " + celsius + " kelvin " + kelvin;
    }

    private String fromKelvin(double input) {
        double celsius = input - 273.15;
        double fahrenheit = (celsius * (9/5) )+ 32;

        return "celsius " + celsius + " fahrenheit " + fahrenheit;
    }

    private String converter(double input, String temperature){
        return switch (temperature) {
            case "c" -> fromCelsius(input);
            case "f" -> fromFahrenheit(input);
            case "k" -> fromKelvin(input);
            default -> "invalid temperature input";
        };
    }

    public void temperature() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter temperature");
        double input = scanner.nextDouble();
        System.out.println("please select from following c/f/k");
        String temperature = scanner.next();

        String result = converter(input, temperature);
        System.out.println(result);
    }

    public void testTemperatureConverter() {
        if(!converter(100, "f").equals("celsius 0.0 kelvin 273.15")){
            System.err.println("test failed. wrong conversion from fahrenheit");
        }

        if(!converter(100, "c").equals("fahrenheit: 132.0 Kelvin 373.17")){
            System.err.println("test failed. wrong conversion from fahrenheit");
        }

        if(!converter(100, "k").equals("celsius -173.14999999999998 fahrenheit -141.14999999999998")){
            System.err.println("test failed. wrong conversion from fahrenheit");
        }

        System.out.println("All test passed");
    }
}
