package sp.bookstore.Book.servies;

import sp.bookstore.Book.models.*;

public interface Visitor {
    void visitBook(Book b);
    void visitSection(Section s);
    void visitTableOfContent(TableOfContents toc);
    void visitParagraph(Paragraph p);
    void visitImageProxy(ImageProxy ip);
    void visitImage(Image i);
    void visitTable(Table t);
}
