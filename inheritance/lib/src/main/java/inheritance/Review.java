package inheritance;

public class Review {
    String body;
    String author;
    float rating; //0-5
    Place place;
    String movie;

    public Review(String body, String author, int rating, Place place) {
        rating = getRating(rating);

        this.body = body;
        this.author = author;
        this.rating = rating;
        this.place = place;
        this.place.addReview(this);
    }

    private int getRating(int rating) {
        if (rating > 5) rating = 5;
        if (rating < 0) rating = 0;
        return rating;
    }

    public Review(String body, String author, int rating, Place place, String movie) throws Exception {
        if (!(place instanceof Theater)) throw new Exception("You can only specify a movie at the Theater!");
        rating = getRating(rating);

        this.body = body;
        this.author = author;
        this.rating = rating;
        this.place = place;
        this.movie = movie;
    }

    @Override
    public String toString(){
        return String.format("restaurant: %s, rating: %.1f, author: %s, Body: %s", place.name, rating, author, body);
    }
}
