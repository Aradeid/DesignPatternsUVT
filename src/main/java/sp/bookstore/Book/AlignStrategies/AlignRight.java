package sp.bookstore.Book.AlignStrategies;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(String p) {
        String output = "#".repeat(20);
        output += p;
        System.out.println(output);
    }
    
}
