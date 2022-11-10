package sp.bookstore.Book.models;

import sp.bookstore.Book.servies.Visitor;

public class TableOfContents implements Element {

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

    @Override
    public void accept(Visitor v) {
        v.visitTableOfContent(this);
    }
}
