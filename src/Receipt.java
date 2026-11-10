public class Receipt implements Printable {
    private Restaurant restaurant;
    private Order order;

    public Receipt(Restaurant restaurant, Order order) {
        this.restaurant = restaurant;
        this.order = order;
    }

    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    @Override
    public void print() {
        Customer customer = order.getCustomer();

        System.out.println("           " + restaurant.getName());
        System.out.println("========================================");
        System.out.println("Order No:    " + order.getOrderNumber());
        System.out.println("Customer: " + customer.getName() + " (" + customer.getPhone() + ")");
        System.out.println("----------------------------------------");
        for (OrderItem item : order.getItems()) {
            System.out.println(item.getMenuItem().getName() + "   x" + item.getQuantity()
                    + "   $" + roundToTwoDecimals(item.getTotalPrice()));
        }
        System.out.println("----------------------------------------");
        System.out.println("Subtotal:      $" + roundToTwoDecimals(order.calculateSubtotal()));
        System.out.println("Tax (" + order.getTaxPercent() + "%):     $" + roundToTwoDecimals(order.calculateTax()));
        System.out.println("TOTAL:         $" + roundToTwoDecimals(order.calculateTotal()));
    }
}
