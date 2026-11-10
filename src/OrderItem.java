public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }
}
