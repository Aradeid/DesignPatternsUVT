package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
	private List<Author> authors = new ArrayList<>();
	private List<Element> children = new ArrayList<>();

	public Book(String title) {
		super(title);
	}

	public void addAuthor(Author author) {
		this.authors.add(author); 
	}

	public void print() {
		System.out.println("Title: " + title);
		for (Author a : authors) {
			a.print();
		}
		for (Element c : children) {
			c.print();
		}
	}
}
