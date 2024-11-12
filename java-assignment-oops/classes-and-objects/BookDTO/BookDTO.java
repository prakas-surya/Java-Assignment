package assignment;

public class BookDTO {
	
	private String title;
	private String author;
	private String isbn;
	private double price;
	private int publishedYear;
	
	private static int totalBooks = 0;
	
	public BookDTO(String title, String author, String isbn, double price, int publishedYear) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.publishedYear = publishedYear;
		totalBooks++;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public double getPublishedYear() {
		return publishedYear;
	}
	
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	public int totalBooks() {
		return totalBooks;
	}
	
	public void displayBookDetails() {
		System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Published Year: " + publishedYear);
        System.out.println("Price: " + price);
        System.out.println("No Of Books : " + totalBooks);
    }
}
