package sp.patternTest;

import sp.patternTest.models.Order;
import sp.patternTest.models.Pasta;
import sp.patternTest.models.Pizza;
import sp.patternTest.models.Salad;
import sp.patternTest.models.Suborder;
import sp.patternTest.services.PriseCalculator;

public class App {
    public static void main(String[] args) {
        Order o1 = new Order();
        Suborder s1 = new Suborder();
        Suborder s2 = new Suborder();

        o1.addSuborder(s1);
        o1.addSuborder(s2);

        s1.addDish(new Pasta("Carbonara", 20));
        s1.addDish(new Pizza("Diavolla", 10));
        s1.addDish(new Pizza("the pineapple one", 16));
        s1.addDish(new Salad("potato salad", 10));
        s2.addDish(new Pizza("Margarita", 18));

        PriseCalculator pc = new PriseCalculator();
        o1.addVisitor(pc);
        pc.print();
    }
    
}
