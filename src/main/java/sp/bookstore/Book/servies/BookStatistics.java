package sp.bookstore.Book.servies;

import sp.bookstore.Book.models.Book;
import sp.bookstore.Book.models.Image;
import sp.bookstore.Book.models.ImageProxy;
import sp.bookstore.Book.models.Paragraph;
import sp.bookstore.Book.models.Section;
import sp.bookstore.Book.models.Table;
import sp.bookstore.Book.models.TableOfContents;

public class BookStatistics implements Visitor {
    private int imgCount = 0;
    private int paragraphCount = 0;
    private int tableCount;

    private AlignStrategy textAlignment = new AlignLeft();

    @Override
    public void visitBook(Book b) {
        
    }

    @Override
    public void visitSection(Section s) {
        
    }

    @Override
    public void visitTableOfContent(TableOfContents toc) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visitParagraph(Paragraph p) {
        ++paragraphCount;
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        ++imgCount;        
    }

    @Override
    public void visitImage(Image i) {
        ++imgCount;        
    }

    @Override
    public void visitTable(Table t) {
        ++tableCount;
    }

    public void setAlignStrategy(AlignStrategy as) {
        textAlignment = as;
    }

    public void print() {
        textAlignment.render("Number of images: " + imgCount);
        textAlignment.render("Number of tables: " + tableCount);
        textAlignment.render("Number of paragraphs: " + paragraphCount);
    }
    
}
