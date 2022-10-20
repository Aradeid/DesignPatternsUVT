package BookStore;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractElement implements Element {
    List<AbstractElement> children;
    public AbstractElement() {
        children = new ArrayList<>();
    }
    public void add(AbstractElement e) {
        if (!hasChild(e)) {
            children.add(e);
        }
    }
    protected boolean hasChild(AbstractElement e) {
        for (AbstractElement child : children) {
            if (child.equals(e) || child.hasChild(e)) {
                return true;
            }
        }
        return false;
    }
    public void remove(AbstractElement e) {
        children.remove(e);//WARNING no way to know if deletion was successful
    }
    public Element get(int index) {
        return children.get(index);
    }
}
