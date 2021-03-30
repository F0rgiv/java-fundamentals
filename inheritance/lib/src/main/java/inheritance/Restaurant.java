package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {
    String name;
    int price; //0-4, $-$$$$
    Set<Review> reviews;

    public Restaurant(String name, int price) {
        this.name = name;
        this.price = price;
        this.reviews = new HashSet<>();

        //validate that the price is properly set.
        if (this.price > 4) this.price = 4;
        if (this.price < 1) this.price = 1;
    }

    public Restaurant(String name, String price) {
        //Restaurant(name, stars, price.length());
        this.name = name;
        this.price = price.length();
        this.reviews = new HashSet<>();

        //validate that the price is properly set.
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

    public float getRating() {
        if (this.reviews.size() == 0) return 0;
        return (float) this.reviews.stream()
                .mapToDouble( review -> review.rating)//get only ratings
                .sum() / this.reviews.size();
    }

    @Override
    public String toString() {
        return String.format("name: %s, stars: %.1f, price: %s(%d)",
                this.name, getRating(), this.getPrice(), this.price);
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }
}
