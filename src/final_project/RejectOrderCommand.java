package final_project;
import java.util.*;
public class RejectOrderCommand implements OrderCommand{
    private Order order;
    private List<Order> newOrders;

    public RejectOrderCommand(Order order, List<Order> newOrders) {
        this.order = order;
        this.newOrders = newOrders;
    }

    @Override
    public void execute() {
        if (newOrders.contains(order)) {
            order.updateStatus(OrderStatus.CANCELLED);
            newOrders.remove(order);
            System.out.println("Заказ с ID " + order.getOrderId() + " отклонён.");
        } else {
            System.out.println("Ошибка: Заказ не найден среди новых заказов.");
        }
    }
}
