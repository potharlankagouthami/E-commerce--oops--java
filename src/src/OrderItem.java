public class OrderItem {
    private Product product;
    private int quantity;
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
    public void displayItem() {
        product.displayDetails();
        System.out.println("  Quantity: " + quantity + " | Item Total: " + getTotalPrice());
    }
}
