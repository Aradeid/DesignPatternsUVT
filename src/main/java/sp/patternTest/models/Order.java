package sp.patternTest.models;

import java.util.ArrayList;
import java.util.List;

import sp.patternTest.services.DishVisitor;

public class Order {
    private List<Suborder> suborders;
    public Order() {
        suborders = new ArrayList<>();
    }
    public void addSuborder(Suborder so) {
        suborders.add(so);
    }
    public void addVisitor(DishVisitor v) {
        for (Suborder so : suborders) {
            so.addVisitor(v);
        }
    }
}
