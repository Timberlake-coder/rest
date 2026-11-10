public class Food extends MenuItem {
    private boolean spicy;

    public Food(String name, double price, boolean spicy) {
        super(name, price);
        this.spicy = spicy;
    }

    @Override
    public String getDescription() {
        if (spicy) {
            return getName() + " - food, spicy";
        }
        return getName() + " - food, not spicy";
    }
}
