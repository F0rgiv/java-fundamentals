package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Place implements ReviewAble {
    String name;
    int price; //0-4, $-$$$$
    Set<Review> reviews = new HashSet<>();

    public Place(String name, int price) {
        this.name = name;
        this.price = price;
        validatePrice();
    }

    public Place(String name, String price) {
        this.name = name;
        this.price = price.length();
        validatePrice();
    }

    private void validatePrice() {
        if (this.price > 4) this.price = 4;
        if (this.price < 1) this.price = 1;
    }

    public String getPrice() {
        StringBuilder price = new StringBuilder();
        int i = 0;
        while (i < this.price) {
            price.append("$");
            i++;
        }
        return price.toString();
    }

    @Override
    public float getRating() {
        if (this.reviews.size() == 0) return 0;
        return (float) this.reviews.stream()
                .mapToDouble(review -> review.rating)//get only ratings
                .sum() / this.reviews.size();
    }

    @Override
    public String toString() {
        return String.format("name: %s, stars: %.1f, price: %s(%d)",
                this.name, getRating(), this.getPrice(), this.price);
    }

    @Override
    public void addReview(Review review) {
        if (review.place != this) return;
        this.reviews.add(review);
    }
}
