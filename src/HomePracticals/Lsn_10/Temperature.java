package HomePracticals.Lsn_10;

/*
 * Celsius to Fahrenheit Formula: (°C * 1.8) + 32 = °F
 * Fahrenheit to Celsius Formula: (°F - 32) / 1.8 = °C
 */


public class Temperature {

    // STEP - 1
    // Two private instances of class
    double temperature;
    double fahrenheitTemperature;


    // STEP - 2: methods that return the values of the temperature and fahrenheitTemperature instance variables
    // Two public methods of Temperature class
    public double getTemperature() {
        return temperature;
    }

    public double getFahrenheitTemperature() {
        return fahrenheitTemperature;
    }


    // STEP - 3: Overload the Temperature constructor
    // A constructor that takes no parameters and sets temperature to 0.0 and fahrenheitTemperature to 32.0.
    public Temperature(){
        this.temperature = 0.0;
        this.fahrenheitTemperature = 32.0;
    }

    // A constructor that takes one parameter representing the temperature in Celsius
    public Temperature(double temperature){
        this.temperature = temperature;
        // and sets temperature to that value and fahrenheitTemperature to the corresponding Fahrenheit temperature.
        this.fahrenheitTemperature = (temperature * 1.8) + 32.0;
    }

    // A method that takes two parameters representing the temperature in Celsius
    // and Fahrenheit, and sets both instance variables accordingly
    public Temperature(double temperature, double fahrenheitTemperature) {
        this.temperature = temperature;
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    // STEP - 4: Overload the setTemperature() method
    // A method that takes one parameter (a double value) representing Celsius,
    // and sets both temperature and fahrenheitTemperature accordingly.
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.fahrenheitTemperature = (temperature * 1.8) + 32.0;
    }

    // A method that takes two parameters representing Celsius
    // and Fahrenheit, and sets both instance variables accordingly.
    public void setTemperature (double temperature, double fahrenheitTemperature){
        this.temperature = temperature;
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    // STEP - 5: Overload the convertToFahrenheit() method
    // no params
    public double convert2Fahrenheit(){
        return (temperature* 1.8)+ 32.0;
    }

    // with one param
    public double convert2Fahrenheit(double temperature){
        return (temperature * 1.8) + 32.0;
    }

    // A STATIC method that takes one parameter representing Celsius
    // and can be called without creating an instance of the subject class.
    public static double staticFahrenheit(double temperature){
        return (temperature * 1.8) + 32.0;
    }
}
