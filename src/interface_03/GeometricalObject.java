package interface_03;

public abstract class GeometricalObject {
    private String color;
    private boolean isFilled;


    public GeometricalObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
