package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testToString() {
        Shop shop1 = new Shop("Fancy Pants", "$$$", "A place with lot's of nice pants");
        Shop shop2 = new Shop("Come Get things!", 2, "description-test :)");
        String expected = "name: Fancy Pants, stars: 0.0, price: $$$(3), description: A place with lot's of nice pants";
        assertEquals("toString should work as expected", expected, shop1.toString());
        expected = "name: Come Get things!, stars: 0.0, price: $$(2), description: description-test :)";
        assertEquals("toString should work as expected", expected, shop2.toString());
    }
}