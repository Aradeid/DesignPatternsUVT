package BookStore;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragrapg: " + text);        
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
