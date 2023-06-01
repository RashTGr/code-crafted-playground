package HomePracticals.Lsn_14;

abstract class Shape {
    private String color; // attribute

    // constructor to set color attribute value
    public Shape(String color) {
        this.color = color;
    }

    // concrete method
    public String getColor(){
        return color;
    }

    // abstract method to be used in subclasses
    public abstract double calculateArea();

}

