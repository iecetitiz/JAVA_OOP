package interface_03;

public class Circle extends GeometricalObject{
    private double radius;

    public Circle(double radius, String color, boolean isFilled) {
        super(color, isFilled);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI* radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
