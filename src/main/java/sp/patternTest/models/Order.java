package sp.patternTest.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Suborder> suborders;
    public Order() {
        suborders = new ArrayList<>();
    }
    public void addSuborder(Suborder so) {
        suborders.add(so);
    }
}
