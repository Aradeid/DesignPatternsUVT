package sp.bookstore.Book.models;

import java.util.ArrayList;
import java.util.List;

import sp.bookstore.Book.servies.Visitor;

public class Section implements Element {
    List<Element> children;
    String title;

    public Section(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element i : children) {
            i.print();
        }
    }
    
    @Override
    public void add(Element e) {
        children.add(e);
    }

    @Override
    public void remove(Element e) {
        children.remove(e);
        
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}
