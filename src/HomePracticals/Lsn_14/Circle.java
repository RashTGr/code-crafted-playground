package HomePracticals.Lsn_14;

class Circle extends Shape{
    private final double radius;
    final double PI = 3.14159;

    // constructor
    public Circle(String color, double radius) {
       super(color); // because applies the constructor of the Shape superclass
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return PI * radius *radius;
    }
}
