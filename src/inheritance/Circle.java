package inheritance;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {

    }

    public Circle(String color, boolean isFilled) {
        super(color, isFilled);
    }

    public double getArea() {
        return Math.PI * radius* radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
