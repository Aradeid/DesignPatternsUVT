package sp.patternTest.services;

import sp.patternTest.models.Pasta;
import sp.patternTest.models.Pizza;
import sp.patternTest.models.Salad;

public class PriseCalculator implements DishVisitor {
    private int saladCosts = 0;
    private int pastaCosts = 0;
    private int pizzaCosts = 0;

    @Override
    public void visitSalad(Salad s) {
        saladCosts += s.getPrise();
    }

    @Override
    public void visitPasta(Pasta p) {
        pastaCosts += p.getPrise();
    }

    @Override
    public void visitPizza(Pizza p) {
        pizzaCosts += p.getPrise();
    }

    public int getSaladCost() {
        return saladCosts;
    }

    public int getPastaCost() {
        return pastaCosts;
    }

    public int getPizzaCost() {
        return pizzaCosts;
    }

    public int getTotalCost() {
        return saladCosts + pastaCosts + pizzaCosts;
    }
    
}
