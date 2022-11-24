package sp.patternTest.models;

import sp.patternTest.services.DishVisitor;

public interface Dish {
    public String getName();
    public int getPrise();
    public void addVisitor(DishVisitor v);
}
