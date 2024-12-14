package Lab3.task1;

public class Circle extends abstractExampleShape{
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area(){
        return Math.PI * radius * radius;
    }
}
