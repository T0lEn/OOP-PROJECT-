package final_project;

public class Order {
    private int orderId;
    private OrderStatus status;
    private String description;

    // Конструктор
    public Order(int orderId, OrderStatus status, String description) {
        this.orderId = orderId;
        this.status = status;
        this.description = description;
    }

    // Геттеры и сеттеры
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Метод для обновления статуса
    public void updateStatus(OrderStatus newStatus) {
        System.out.println("Статус заказа с ID " + orderId + " изменён с " + status + " на " + newStatus + ".");
        this.status = newStatus;
    }

    // Метод toString для удобного отображения информации о заказе
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }
}
