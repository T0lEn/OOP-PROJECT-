package practice4;

public class Rectangle extends Shape {
    private int width, height;
    public Rectangle(int position, Color color, int width, int height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
