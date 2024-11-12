package assignment;

public class BookManagement {

	public static void main(String[] args) {
		
		BookDTO book = new BookDTO("book1", "John", "B123", 850, 1978);
		
		// get attributes
		System.out.println("Get Book Title : " + book.getTitle());
		System.out.println("Get Arthur : " + book.getAuthor());
		System.out.println("Get ISBN : " + book.getISBN());
		System.out.println("Get Price : " + book.getPrice());
		System.out.println("Get Published Year : " + book.getPublishedYear());
		System.out.println("Get Total No Of Books : " + book.totalBooks());
		
		// set attributes
		book.setAuthor("Joe");
		book.setISBN("B456");
		book.setPrice(900);
		book.setPublishedYear(2000);
		book.setTitle("book2");
		
		// use getDetails
		System.out.println();
		System.out.println("Display Book details using displayBookDetails method :");
		book.displayBookDetails();
		
	}

}
