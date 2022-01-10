package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice;

    public Dodgems(String name, int rating, double defaultPrice) {
        super(name, rating);
        this.defaultPrice = defaultPrice;
    }


    public double defaultPrice() {
        return defaultPrice;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge() <= 12){
            return defaultPrice / 2;
        }
        return defaultPrice;
    }
}
