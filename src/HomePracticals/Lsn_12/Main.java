package HomePracticals.Lsn_12;

public class Main {
    public static void main(String[] args) {

        Car luxuryBrand = new Car("Audi", " Q8 ", 2023, 4);
        Car midSegment = new Car("Honda", " Insight ", 2022, 4);

        System.out.println(luxuryBrand.toString());
        System.out.println(midSegment.toString());
        luxuryBrand.move();


    }
}
