package HomePracticals.Lsn_14;

class Rectangle extends Shape{
    private final double length;
    private final double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color); // because applies the constructor of the Shape superclass
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}
