package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    List<Element> children;
    String title;

    public Section(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Element e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Element get(int index) {
        // TODO Auto-generated method stub
        return null;
    }
}
