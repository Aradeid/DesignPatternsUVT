package sp.patternTest.models;

import sp.patternTest.services.DishVisitor;

public class Pasta implements Dish {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getPrise() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void addVisitor(DishVisitor v) {
        v.visitPasta(this);
    }
    
}
