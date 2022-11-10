package sp.bookstore.Book.models;

import sp.bookstore.Book.servies.AlignLeft;
import sp.bookstore.Book.servies.AlignStrategy;
import sp.bookstore.Book.servies.Visitor;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy textAlignment = new AlignLeft();

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void print() {
        textAlignment.render(text);     
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
        v.visitParagraph(this);
    }
}
