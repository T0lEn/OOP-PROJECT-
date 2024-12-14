package practice4;

public class Triangle extends Shape{
    private int size;
    public Triangle(int position, Color color, int size) {
        super(position, color);
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle: ");
        for (int i = 1; i <= size; i++ ){
            for (int j = 0; j < i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
