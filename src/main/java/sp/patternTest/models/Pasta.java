package sp.patternTest.models;

import sp.patternTest.services.DishVisitor;

public class Pasta extends AbstractDish {

    public Pasta(String name, int prise) {
        super(name, prise);
    }

    @Override
    public void addVisitor(DishVisitor v) {
        v.visitPasta(this);
    }
    
}
