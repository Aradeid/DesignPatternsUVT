package BookStore.AlignStrategies;

import BookStore.Paragraph;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(String p) {
        String output = "#".repeat(20);
        output += p;
        System.out.println(output);
    }
    
}
