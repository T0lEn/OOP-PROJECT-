package Lab3.task1;

public class testShape {
    public static void main(String[] args) {
        abstractExampleShape circle = new Circle("КРАСНЫЙ", 5);
        abstractExampleShape rectangle = new Reactangle("BLUE", 3, 6);

        System.out.println(circle.getColor()+" круг с " + "площадью: " + circle.area());
        System.out.println(rectangle.getColor() + " синий квадрат с площадью: " + rectangle.area());
    }
}
