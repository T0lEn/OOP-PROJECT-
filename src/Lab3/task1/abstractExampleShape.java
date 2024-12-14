package Lab3.task1;

public abstract class abstractExampleShape {
    String color;
    abstractExampleShape(String color) {
        this.color = color;
    }
    abstract double area();

    String getColor() {
        return color;
    }
}
