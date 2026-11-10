import java.util.ArrayList;

public class Order {
    private String orderNumber;
    private Customer customer;
    private int taxPercent;
    private ArrayList<OrderItem> items = new ArrayList<>();

    public Order(String orderNumber, Customer customer, int taxPercent) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.taxPercent = taxPercent;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getTaxPercent() {
        return taxPercent;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateSubtotal() {
        double subtotal = 0;
        for (OrderItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    public double calculateTax() {
        return calculateSubtotal() * taxPercent / 100;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
