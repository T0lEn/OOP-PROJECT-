package practice4;

import java.util.Vector;

public class TestShape {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();
        shapes.add(new Circle(1, Color.RED, 3));
        shapes.add(new Rectangle(2, Color.BLUE, 3, 3));
        shapes.add(new Triangle(3, Color.GREEN, 5));
        for (Shape shape : shapes){
            shape.draw();
            System.out.println();
        }
    }

}
