package BookStore.AlignStrategies;

import BookStore.Paragraph;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(String p) {
        System.out.println(p);
    }
    
}
