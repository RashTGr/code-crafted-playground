package HomePracticals.Lsn_12;

public class Car extends Vehicle {

    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public String toString(){
        return make+ "," +model+ "," +year+ "," +numDoors;
    }
}

