package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testToString() {
        Theater theater = new Theater("Watch Stuff here", "$$");
        theater.addMovie("movie1");
        theater.addMovie("movie2");
        String expected = "name: Watch Stuff here, stars: 0.0, price: $$(2), now showing:[movie2, movie1]";
        assertEquals("to Sting should work as expected", expected, theater.toString());
    }

    @Test
    public void addMovie() {
        Theater theater = new Theater("Watch Stuff here", "$$");
        assertEquals("movie should be there", 0, theater.movies.size());
        theater.addMovie("movie1");
        assertEquals("movie should be there", 1, theater.movies.size());
        assertTrue("Movie should be there", theater.movies.contains("movie1"));
        theater.addMovie("movie2");
        assertEquals("movie should be there", 2, theater.movies.size());
        assertTrue("Movie should be there", theater.movies.contains("movie2"));
    }

    @Test
    public void removeMovie() {
        Theater theater = new Theater("Watch Stuff here", "$$");
        theater.addMovie("movie1");
        theater.addMovie("movie2");
        assertEquals("movie should be there", 2, theater.movies.size());
        assertTrue("Movie should be there", theater.movies.contains("movie1"));
        theater.removeMovie("movie1");
        assertEquals("movie should be there", 1, theater.movies.size());
        assertFalse("Movie should be there", theater.movies.contains("movie1"));

    }
}