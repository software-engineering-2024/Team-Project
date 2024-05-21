package OrderManagementSystem;
import java.util.List;
public class OrderManagementSystem {
private List<Order> orders = new ArrayList<>();
    private List<OrderObserver> observers = new ArrayList<>();
    private Map<String, List<String>> orderHistory;
    private static final Logger LOGGER = Logger.getLogger(OrderManagementSystem.class.getName());
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public OrderManagementSystem() {
        orderHistory = new HashMap<>();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
        LOGGER.fine("Observer added: " + observer.getClass().getSimpleName());
    }

    public void updateOrderStatus(String orderID, String newStatus) {
        Order order = findOrder(orderID);
        if (order != null) {
            String oldStatus = order.getStatus();
            if (!oldStatus.equals(newStatus)) {
                order.setStatus(newStatus);
                notifyObservers(order);
                logOrderHistory(orderID, oldStatus, newStatus);
                LOGGER.info("Order " + orderID + " updated from " + oldStatus + " to " + newStatus);
            }
        } else {
            LOGGER.severe("Order not found: " + orderID);
            throw new IllegalStateException("Order ID not found in the system: " + orderID);
        }
    }

    private Order findOrder(String orderID) {
        return orders.stream()
            .filter(o -> o.getOrderID().equals(orderID))
            .findFirst()
            .orElse(null);
    }

    private void notifyObservers(Order order) {
        observers.forEach(observer -> {
            observer.update(order);
            LOGGER.fine("Notified " + observer.getClass().getSimpleName() + " of order update: " + order.getOrderID());
        });
    }

    public void placeOrder(Order order) {
        orders.add(order);
        notifyObservers(order);
        logOrderHistory(order.getOrderID(), "Placed", order.getStatus());
        LOGGER.info("Order placed: " + order.getOrderID());
    }

    public void cancelOrder(String orderID) {
        Order order = findOrder(orderID);
        if (order != null) {
            if (!"Canceled".equals(order.getStatus())) {
                String previousStatus = order.getStatus();
                order.setStatus("Canceled");
                notifyObservers(order);
                logOrderHistory(orderID, previousStatus, "Canceled");
                LOGGER.info("Order canceled: " + orderID);
            }
        } else {
            LOGGER.severe("Order not found to cancel: " + orderID);
            throw new IllegalArgumentException("Order ID not found: " + orderID);
        }
    }

    public void processReturns(String orderID) {
        Order order = findOrder(orderID);
        if (order != null && "Delivered".equals(order.getStatus())) {
            order.setStatus("Returned");
            notifyObservers(order);
            logOrderHistory(orderID, "Delivered", "Returned");
            LOGGER.info("Order returned: " + orderID);
        } else {
            LOGGER.warning("Return failed for order: " + orderID + "; Status not delivered.");
        }
    }

    public int countOrdersByStatus(String status) {
        long count = orders.stream()
            .filter(o -> status.equals(o.getStatus()))
            .count();
        LOGGER.info("Number of orders with status '" + status + "': " + count);
        return (int) count;
    }

    public void archiveCompletedOrders() {
        List<Order> toArchive = orders.stream()
            .filter(o -> "Delivered".equals(o.getStatus()))
            .toList();
        toArchive.forEach(o -> {
            orders.remove(o);
            logOrderHistory(o.getOrderID(), o.getStatus(), "Archived");
            LOGGER.info("Order archived: " + o.getOrderID());
        });
    }

    private void logOrderHistory(String orderID, String fromStatus, String toStatus) {
        String message = String.format("Order status changed from %s to %s on %s", fromStatus, toStatus, dateFormat.format(new Date()));
        orderHistory.computeIfAbsent(orderID, k -> new ArrayList<>()).add(message);
        LOGGER.info("Order history updated for " + orderID + ": " + message);
    }

    public List<String> getOrderHistory(String orderID) {
        return orderHistory.getOrDefault(orderID, new ArrayList<>());
    }
}
