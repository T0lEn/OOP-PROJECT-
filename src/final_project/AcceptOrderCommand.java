package final_project;
import java.util.*;
public class AcceptOrderCommand implements OrderCommand{
    private Order order;
    private List<Order> acceptedOrders;
    private List<Order> newOrders;

    public AcceptOrderCommand(Order order, List<Order> newOrders, List<Order> acceptedOrders) {
        this.order = order;
        this.newOrders = newOrders;
        this.acceptedOrders = acceptedOrders;
    }

    @Override
    public void execute() {
        if (newOrders.contains(order)) {
            order.updateStatus(OrderStatus.PROCESSING);
            acceptedOrders.add(order);
            newOrders.remove(order);
            System.out.println("Заказ с ID " + order.getOrderId() + " принят.");
        } else {
            System.out.println("Ошибка: Заказ не найден среди новых заказов.");
        }
    }
}
