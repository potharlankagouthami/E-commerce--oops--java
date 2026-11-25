public class Electronics extends Product {
    private int warrantyMonths;
    public Electronics(int id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }
    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + name + " | Price: " + price + " | Warranty: " + warrantyMonths + " months");
    }
}
