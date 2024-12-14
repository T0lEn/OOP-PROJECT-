package practice6;

public class Resturant {
    boolean servePizza(CanHavePizza eater){
        eater.eatPizza();
        if (eater instanceof Person){
            System.out.println("Processing payment for person");
        }
        else {
            System.out.println("No needed payment");
        }
    return true;
    }
}
