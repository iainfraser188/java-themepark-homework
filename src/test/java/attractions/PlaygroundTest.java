package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(14,5.6,30.54);
        visitor2 = new Visitor(20,6.2,150.67);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canPlayInPlayground(){
        assertEquals(true, playground.isAllowed(visitor));
    }

    @Test
    public void cannotPlayInPlayground(){
        assertEquals(false,playground.isAllowed(visitor2));
    }

}
