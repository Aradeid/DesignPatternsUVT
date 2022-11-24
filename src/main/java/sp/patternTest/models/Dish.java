package sp.patternTest.models;

import sp.patternTest.services.DishVisitor;

public interface Dish {
    public String getName();
    public String getPrise();
    public void addVisitor(DishVisitor v);
}
