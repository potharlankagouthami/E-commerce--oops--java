public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 55000, 12);
        Product p2 = new Clothing(2, "T-Shirt", 999, "M");
        Customer customer = new Customer(101, "Gouthami", "gouthami@gmail.com");
        Order order = new Order(1001, customer);
        order.addItem(new OrderItem(p1, 1));
        order.addItem(new OrderItem(p2, 3));
        order.displayOrder();
        Payment payment = new UpiPayment(order.calculateTotal(), "gouthami@upi");
        payment.pay();
    }
}
