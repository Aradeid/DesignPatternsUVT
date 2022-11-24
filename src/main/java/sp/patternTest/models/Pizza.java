package sp.patternTest.models;

import sp.patternTest.services.DishVisitor;

public class Pizza extends AbstractDish {
    public Pizza(String name, int prise) {
        super(name, prise);
    }

    @Override
    public void addVisitor(DishVisitor v) {
        v.visitPizza(this);
    }
    
}
