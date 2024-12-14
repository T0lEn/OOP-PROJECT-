package final_project;

import java.util.*;

public class TechSupport extends User {
    private int worker_id;
    private String name;
    private List<Order> newOrders;
    private List<Order> acceptedOrders;

    public TechSupport(int worker_id, String name, String userName, String password, int id, String email, boolean isActive, UserRole role) {
        super(userName, password, id, email, isActive, role);
        this.worker_id = worker_id;
        this.name = name;
        this.newOrders = new ArrayList<>();
        this.acceptedOrders = new ArrayList<>();
    }

    // Getters
    public int getWorkerId() {
        return worker_id;
    }

    public String getName() {
        return name;
    }

    public List<Order> getNewOrders() {
        return newOrders;
    }

    public List<Order> getAcceptedOrders() {
        return acceptedOrders;
    }

    // Setters
    public void setWorkerId(int worker_id) {
        this.worker_id = worker_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewOrders(List<Order> newOrders) {
        if (newOrders != null) {
            this.newOrders = newOrders;
        } else {
            System.out.println("Ошибка: Список новых заказов не может быть null.");
        }
    }

    public void setAcceptedOrders(List<Order> acceptedOrders) {
        if (acceptedOrders != null) {
            this.acceptedOrders = acceptedOrders;
        } else {
            System.out.println("Ошибка: Список принятых заказов не может быть null.");
        }
    }

    // Метод для выполнения команды
    public void executeCommand(OrderCommand command) {
        command.execute();
    }
}
