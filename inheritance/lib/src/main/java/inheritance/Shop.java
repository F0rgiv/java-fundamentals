package inheritance;

public class Shop extends Place {
    public Shop(String name, int price) {
        super(name, price);
    }

    public Shop(String name, String price) {
        super(name, price);
    }
}
