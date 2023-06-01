package HomePracticals.Lsn_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("input for Celsius: ");
        double c = scan.nextDouble();
        System.out.print("input for Fahrenheit: ");
        double f = scan.nextDouble();

        // Object of Temperature class without args constructor
        Temperature temperature = new Temperature();


        // Constructor with one param
        Temperature temperature2 = new Temperature(19.00);
        System.out.println("C (v2): " + temperature2.getTemperature());
        System.out.println("F (v2): " + temperature2.getFahrenheitTemperature());

        System.out.println();

        // Constructor with two params
        Temperature temperature3 = new Temperature(28.00, 77.00);
        System.out.println("C (v3): " + temperature3.getTemperature());
        System.out.println("F (v3): " + temperature3.getFahrenheitTemperature());

        System.out.println();

        // Set the value using any of the methods.
        temperature2.setTemperature(33);
        System.out.println("C with set method: " + temperature2.getTemperature());
        System.out.println("F with set method: " + temperature2.getFahrenheitTemperature());

        System.out.println("F: " + temperature2.convert2Fahrenheit(10));

        // Static method without creating an object
        System.out.println("F(static): " + Temperature.staticFahrenheit(17));

        // With input
        Temperature temperature4 = new Temperature(c, f);
        System.out.println("C (v4): " + temperature4.getTemperature());
        System.out.println("F (v4): " + temperature4.getFahrenheitTemperature());

        scan.close();

    }
}
