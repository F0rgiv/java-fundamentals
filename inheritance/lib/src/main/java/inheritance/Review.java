package inheritance;

public class Review {
    String body;
    String author;
    float rating; //0-5
    Place place;

    public Review(String body, String author, int rating, Place place) {
        //validate that the rating is properly set.
        if (rating > 5) rating = 5;
        if (rating < 0) rating = 0;

        this.body = body;
        this.author = author;
        this.rating = rating;
        this.place = place;
        this.place.addReview(this);
    }

    @Override
    public String toString(){
        return String.format("restaurant: %s, rating: %.1f, author: %s, Body: %s", place.name, rating, author, body);
    }
}
