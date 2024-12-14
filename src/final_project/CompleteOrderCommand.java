package final_project;
import java.util.*;

public class CompleteOrderCommand implements OrderCommand{
    private Order order;
    private List<Order> acceptedOrders;

    public CompleteOrderCommand(Order order, List<Order> acceptedOrders) {
        this.order = order;
        this.acceptedOrders = acceptedOrders;
    }

    @Override
    public void execute() {
        if (acceptedOrders.contains(order)) {
            order.updateStatus(OrderStatus.DONE);
            acceptedOrders.remove(order);
            System.out.println("Заказ с ID " + order.getOrderId() + " завершён.");
        } else {
            System.out.println("Ошибка: Заказ не найден среди принятых заказов.");
        }
    }
}
