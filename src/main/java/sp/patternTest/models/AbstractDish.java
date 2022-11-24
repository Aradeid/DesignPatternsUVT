package sp.patternTest.models;

public abstract class AbstractDish implements Dish {
    protected String name;
    protected int prise;

    public AbstractDish(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrise() {
        return prise;
    }
}
