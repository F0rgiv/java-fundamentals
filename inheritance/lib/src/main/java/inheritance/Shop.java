package inheritance;

public class Shop extends Place {
    String description;

    public Shop(String name, int price, String description) {
        super(name, price);
        this.description = description;
    }

    public Shop(String name, String price, String description) {
        super(name, price);
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", description: %s", this.description);
    }
}
