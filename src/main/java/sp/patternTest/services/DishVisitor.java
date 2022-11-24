package sp.patternTest.services;

import sp.patternTest.models.Pasta;
import sp.patternTest.models.Pizza;
import sp.patternTest.models.Salad;

public interface DishVisitor {
    public void visitSalad(Salad s);
    public void visitPasta(Pasta p);
    public void visitPizza(Pizza p);
}
