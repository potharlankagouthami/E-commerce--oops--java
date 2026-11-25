public class UpiPayment extends Payment {
    private String upiId;
    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }
    @Override
    public void pay() {
        System.out.println("Paid Rs." + amount + " via UPI: " + upiId);
    }
}
