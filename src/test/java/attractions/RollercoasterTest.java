package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10,8.40);
        visitor1 = new Visitor(14,210,40);
        visitor2 = new Visitor(10,120,20);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollercoster(){
        assertEquals(true,rollerCoaster.isAllowed(visitor1));
    }

    @Test
    public void cannotRideRollercoster(){
        assertEquals(false,rollerCoaster.isAllowed(visitor2));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.4, rollerCoaster.defaultPrice() ,0.0);
    }

    @Test
    public void canChargeDoubleTrue(){
        assertEquals(16.8,rollerCoaster.priceFor(visitor1),0.0);
    }

    @Test
    public void canChargeDoubleFalse(){
        assertEquals(8.4,rollerCoaster.priceFor(visitor2),0.0);
    }

}
