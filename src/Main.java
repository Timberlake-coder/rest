public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Chorsu Grill House");
        Customer customer = new Customer("Aziz Karimov", "998901234567");

        MenuItem pizza = new Food("Pizza", 8.50, false);
        MenuItem kebab = new Food("Lamb Kebab", 11.00, true);
        MenuItem icedTea = new Drink("Iced Tea", 3.30, 500);

        OrderItem pizzaItem = new OrderItem(pizza, 1);
        OrderItem kebabItem = new OrderItem(kebab, 1);
        OrderItem teaItem = new OrderItem(icedTea, 2);
        kebabItem.setQuantity(2);

        Order order = new Order("ORD-0001", customer, 10);
        order.addItem(pizzaItem);
        order.addItem(kebabItem);
        order.addItem(teaItem);

        Printable receipt = new Receipt(restaurant, order);
        receipt.print();

        System.out.println();
        System.out.println("Item details:");
        System.out.println(pizza.getDescription());
        System.out.println(kebab.getDescription());
        System.out.println(icedTea.getDescription());
    }
}
