import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");

        double temperature = scanner.nextDouble();

        System.out.print("Enter type of temperature (F | C): ");

        String temperatureType = scanner.next();

        if (temperatureType.equalsIgnoreCase("F")) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " degrees Fahrenheit is " + celsius + " degrees Celcius.");
        } else if (temperatureType.equalsIgnoreCase("C")) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " degrees Celcius is " + fahrenheit + " degrees Fahrenheit");
        } else {
            System.out.println("Temperature type '" + temperatureType + "' is not supported.");
        }

        scanner.close();
    }
}
