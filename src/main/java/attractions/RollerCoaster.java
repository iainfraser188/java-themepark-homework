package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    private double defaultPrice;

    public RollerCoaster(String name, int rating, double defaultPrice) {
        super(name, rating);
        this.defaultPrice = defaultPrice;
    }

    public boolean isAllowed(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        }
        return false;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() >= 200){
            return defaultPrice * 2;
        }
        return defaultPrice;
    }

    public double defaultPrice() {
        return defaultPrice;
    }
}
