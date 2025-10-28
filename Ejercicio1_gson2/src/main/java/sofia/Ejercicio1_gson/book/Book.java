package sofia.Ejercicio1_gson.book;

public class Book {
	String title;
	String author;
	int yearPublication;
	
	public Book(String title, String author, int yearPublication) {
		this.title = title;
		this.author =  author;
		this.yearPublication =  yearPublication;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYearPublication() {
		return yearPublication;
	}
}
