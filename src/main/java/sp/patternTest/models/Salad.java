package sp.patternTest.models;

import sp.patternTest.services.DishVisitor;

public class Salad extends AbstractDish {
    public Salad(String name, int prise) {
        super(name, prise);
    }

    @Override
    public void addVisitor(DishVisitor v) {
        v.visitSalad(this);
    }
    
}
