package Lab3.task1;

public class Reactangle extends abstractExampleShape{
    double height, width;

    Reactangle(String color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;
    }

    double area(){
        return height * width;
    }
}
