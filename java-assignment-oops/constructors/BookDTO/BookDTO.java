package assignment;

public class BookDTO {
	
	private String title;
	private String author;
	private String isbn;
	private double price;
	private int publishedYear;
	
	// since requirement needs array of books i'm assuming books count is 100
	private static BookDTO[] books = new BookDTO[100];
	private static int totalBooks = 0;
	
	public BookDTO(String title, String author, String isbn, double price, int publishedYear) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.publishedYear = publishedYear;
		
		addBook(this);
	}
	
	private static void addBook(BookDTO book) {
		if (totalBooks < books.length) {
			books[totalBooks++] = book;
		} else {
			System.out.println("Book List is Full, cannot add more Books!");
		}
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
	
	public int getPublishedYear() {
		return publishedYear;
	}
	
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	public static int totalBooks() {
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
	
	public static void displayAllBooks() {
		System.out.println("The Book Collections are : ");
		for (int i=0; i<totalBooks; i++) {
			System.out.println("Title: " + books[i].title + ", Author: " + books[i].author + ", ISBN: " + books[i].isbn + ", Published year: " + books[i].publishedYear + ", Price: " + books[i].price);
		}
	}
}
