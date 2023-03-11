package interface_03;

import java.util.List;

public class AreaService {

   /* public double calculateArea(List<Rectangle> shapes)  {
        double area = 0;
        for(Rectangle rect : shapes) {
            area += (rect.getLength() * rect.getHeight());
        }
        return area;
    }

    */

    public double calculateArea(List<Object> shapes)  {
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
}
