package interface_03;

public class Rectangle extends GeometricalObject{
    private double length;
    private double height;


    public Rectangle(double length, double height, String color, boolean isFilled) {
        super(color, isFilled);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
