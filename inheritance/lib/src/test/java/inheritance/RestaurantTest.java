package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    //confirm rating is always between 0 and 5
    @Test
    public void RestaurantTestToString() {
        Restaurant restaurant1 = new Restaurant("Not so Good", 2);
        Restaurant restaurant2 = new Restaurant("nummies", "$$$$");
        Restaurant restaurant3 = new Restaurant("Cheep'n'good", -123);
        assertEquals("should print formatted Restaurant info",
                "name: Not so Good, stars: 0.0, price: $$(2)",
                restaurant1.toString());
        assertEquals("should print formatted Restaurant info",
                "name: nummies, stars: 0.0, price: $$$$(4)",
                restaurant2.toString());
        assertEquals("should print formatted Restaurant info",
                "name: Cheep'n'good, stars: 0.0, price: $(1)",
                restaurant3.toString());
    }
    @Test
    public void RestaurantTestGetRating() {
        Restaurant restaurant = new Restaurant("nummies", "$$$$");
        assertEquals("should show default rating", -1, restaurant.getRating(), 2);
        new Review("This place is amazing!", "James", 5, restaurant);
        assertEquals("should show correct", 5, restaurant.getRating(), 2);
        new Review("This place is amazing!", "James", 1, restaurant);
        assertEquals("should show correct", 2.5, restaurant.getRating(), 2);
        new Review("This place is amazing!", "James", 5, restaurant);
        assertEquals("should show correct", 3.7, restaurant.getRating(), 2);
    }
    @Test
    public void RestaurantTestCantAddDoubleRating() {
        Restaurant restaurant = new Restaurant("nummies", "$$$$");
        Review review = new Review("This place is amazing!", "James", 5, restaurant);
        assertEquals("should show correct", 5, restaurant.getRating(), 2);
        new Review("This place is amazing!", "James", 1, restaurant);
        assertEquals("should show correct", 2.5, restaurant.getRating(), 2);
        restaurant.addReview(review);
        assertEquals("should show correct", 2.5, restaurant.getRating(), 2);
        restaurant.reviews.add(review);
        assertEquals("should show correct", 2.5, restaurant.getRating(), 2);
    }
}
