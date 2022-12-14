package sp.patternTest.services;

import sp.patternTest.models.Pasta;
import sp.patternTest.models.Pizza;
import sp.patternTest.models.Salad;

public class PriseCalculator implements DishVisitor {
    private int saladCosts = 0;
    private int pastaCosts = 0;
    private int pizzaCosts = 0;
    private int totalCosts = 0;

    @Override
    public void visitSalad(Salad s) {
        saladCosts += s.getPrise();
        recalculateTotalCost();
    }

    @Override
    public void visitPasta(Pasta p) {
        pastaCosts += p.getPrise();
        recalculateTotalCost();
    }

    @Override
    public void visitPizza(Pizza p) {
        pizzaCosts += p.getPrise();
        recalculateTotalCost();
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

    private void recalculateTotalCost() {
        totalCosts = saladCosts + pastaCosts + pizzaCosts;
    }

    public int getTotalCost() {
        return totalCosts;
    }

    public void print() {
        System.out.println("Salad costs = " + saladCosts);
        System.out.println("Pizza costs = " + pizzaCosts);
        System.out.println("Pasta costs = " + pastaCosts);
        System.out.println("Total costs = " + totalCosts);
    }
    
}
