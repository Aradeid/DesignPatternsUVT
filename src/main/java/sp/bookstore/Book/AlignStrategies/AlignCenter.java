package sp.bookstore.Book.AlignStrategies;

public class AlignCenter implements AlignStrategy {

    @Override
    public void render(String p) {
        String output = "#".repeat(8);
        output += p;
        System.out.println(output);
    }
    
}
