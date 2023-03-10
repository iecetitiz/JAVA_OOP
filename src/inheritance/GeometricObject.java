package inheritance;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean isFilled = true;
    private Date dateCreated;

    protected GeometricObject() {
        this.color = "white";
        isFilled = true;
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean isFilled) {
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

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
