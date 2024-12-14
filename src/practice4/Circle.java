package practice4;

public class Circle extends Shape {
    private int radius;
    public Circle(int position, Color color, int radius) {
        super(position, color);
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle: ");
        for (int i = 0; i <= 2*radius; i++) {
            for (int j = 0; j <= 2*radius; j++) {
                int xSquared = (i - radius) * (i - radius);
                int ySquared = (j - radius) * (j - radius);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius){
                    System.out.println("*");
                }
                else {
                    System.out.println(" ");
                }
                System.out.println();
            }

        }
    }
}
