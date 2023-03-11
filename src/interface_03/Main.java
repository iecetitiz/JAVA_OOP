package interface_03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "pink", true);
        Rectangle rectangle = new Rectangle(2, 3, "blue", true);

        ArrayList<GeometricalObject> myList = new ArrayList<>();
        myList.add(circle);
        myList.add(rectangle);

        double area = calculateArea(myList);
        System.out.println(area);


    }

    /*public double calculateArea(List<GeometricalObject> shapes)  {
        double area = 0;
        for(Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle)shape;
                area += (rect.getLength() * rect.getHeight());
            } else if (shape instanceof Circle) {
                Circle circle = (Circle)shape;
                area += (circle.getRadius() * circle.getRadius() * Math.PI);
            } else {
                throw new RuntimeException("Shape not supported");
            }

        }
        return area;
    }

     */

    public static double calculateArea(List<GeometricalObject> shapes) {
        double area = 0;
        for (GeometricalObject go : shapes) {
            area += (go.getArea());
        }
        return area;
    }
}
