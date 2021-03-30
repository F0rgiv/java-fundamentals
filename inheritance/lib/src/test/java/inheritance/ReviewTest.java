package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReviewTest {
    @Test
    public void testReviewCreation() {
        Restaurant restaurant = new Restaurant("nummies", "$$$$");
        Review review = new Review("This place is amazing!", "James", 5, restaurant);
        assertEquals("confirm the review exists within the restaurant", 1, restaurant.reviews.size());
        assertTrue("confirm the review exists within the restaurant", restaurant.reviews.contains(review));
    }

    @Test
    public void testReviewToString() {
        Restaurant restaurant = new Restaurant("nummies", "$$$$");
        Review review = new Review("This place is amazing!", "James", 5, restaurant);
        String expected = "restaurant: nummies, rating: 5.0, author: James, Body: This place is amazing!";
        assertEquals("toString should output clean data", expected, review.toString());
    }
}
