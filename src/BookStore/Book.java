package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<String> images = new ArrayList<>();
	private List<String> paragraphs = new ArrayList<>();
	private List<String> tables = new ArrayList<>();

	public Book(String title) {
		this.title = title;
	}

	public boolean createNewParagraph(String paragraph) {
		return this.paragraphs.add(paragraph);
		
	}

	public boolean createNewImage(String image) {
		return this.images.add(image);
	}

	public boolean createNewTable(String table) {
		return this.tables.add(table);
		
	}

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("Paragraphs:");
		for(String p : paragraphs) {
			System.out.println(p);
		}
		
		System.out.println("Images:");
		for(String im : images) {
			System.out.println(im);
		}
		
		System.out.println("Tables:");
		for(String t : tables) {
			System.out.println(t);
		}
	}
}
