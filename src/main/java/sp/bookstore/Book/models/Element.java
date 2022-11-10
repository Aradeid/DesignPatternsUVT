package sp.bookstore.Book.models;

import sp.bookstore.Book.servies.Visitor;

public interface Element {
    public void print();
    public void add(Element e);
    public void remove(Element e);
    public Element get(int index);
    public void accept(Visitor v);
}
