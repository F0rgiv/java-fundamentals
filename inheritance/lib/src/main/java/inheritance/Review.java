package inheritance;

public class Review {
    String body;
    String author;
    float rating; //0-5
    Restaurant restaurant;

    public Review(String body, String author, int rating, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.rating = rating;
        this.restaurant = restaurant;
        this.restaurant.addReview(this);
    }

    @Override
    public String toString(){
        return String.format("restaurant: %s, rating: %.1f, author: %s, Body: %s", restaurant.name, rating, author, body);
    }
}
