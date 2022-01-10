package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,3);
        visitor = new Visitor(14,5.6,30.54);
        visitor2 = new Visitor(20,6.2,150.67);

    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canGetServed(){
        assertEquals(true, tobaccoStall.isAllowed(visitor2));
    }

    @Test
    public void cannotGetServed(){
        assertEquals(false, tobaccoStall.isAllowed(visitor));
    }

    @Test
    public void hasRating(){
        assertEquals(3,tobaccoStall.getRating());
    }
}
