package HomePracticals.Lsn_14;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Orange", 7.0);
        Rectangle rectangle = new Rectangle("Red", 5.77, 7.55);

        // Results for Circle class
        System.out.println("Circle color is " + circle.getColor());
        System.out.println("Circle calc.area: " +circle.calculateArea());

        // Results for Rectangle class
        System.out.println("\nRectangle color is " + rectangle.getColor());
        System.out.println("Rectangle area calc. " + rectangle.calculateArea());

    }
}
