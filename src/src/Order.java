import java.util.ArrayList;
import java.util.List;
public class Order {
    private int orderId;
    private Customer customer;
    private List<OrderItem> items;
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }
    public void addItem(OrderItem item) {
        items.add(item);
    }
    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
    public void displayOrder() {
        System.out.println("\n--- Order ID: " + orderId + " ---");
        customer.displayCustomer();
        for (OrderItem item : items) {
            item.displayItem();
        }
        System.out.println("Order Total: Rs." + calculateTotal());
    }
}
