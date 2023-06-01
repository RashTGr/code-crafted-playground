package HomePracticals.Lsn_12;

public class Vehicle {

    String make;
    String model;
    int year;

    // Constructor
    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void move(){
        System.out.println("Car is moving");
    }


}
