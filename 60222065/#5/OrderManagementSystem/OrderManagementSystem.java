package OrderManagementSystem;
import java.util.*;
public class OrderManagementSystem {
	private List<Order> orders = new ArrayList<>();
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
        notifyObservers(order);
    }

    private void notifyObservers(Order order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
}
