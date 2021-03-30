package inheritance;

public class Restaurant extends Place{
    public Restaurant(String name, int price) {
        super(name, price);
    }

    public Restaurant(String name, String price) {
        super(name, price);
    }
}
