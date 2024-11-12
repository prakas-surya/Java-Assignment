package assignment;

public class BookManagement {

	public static void main(String[] args) {
		
		BookDTO book1 = new BookDTO("book1", "John", "B123", 850, 1978);
		new BookDTO("book2", "Bill", "B789", 840, 1966);
		new BookDTO("book3", "Phil", "B125", 830, 1970);
		new BookDTO("book4", "Jim", "B126", 700, 1970);
		new BookDTO("book5", "Dan", "B127", 600, 1968);
		
		// get attributes
		System.out.println("Printing book1 details using getters:");
		System.out.println("Get Book Title : " + book1.getTitle());
		System.out.println("Get Arthur : " + book1.getAuthor());
		System.out.println("Get ISBN : " + book1.getISBN());
		System.out.println("Get Price : " + book1.getPrice());
		System.out.println("Get Published Year : " + book1.getPublishedYear());
		System.out.println("Get Total No Of Books : " + BookDTO.totalBooks());
		
		// set attributes
		book1.setAuthor("Joe");
		book1.setISBN("B456");
		book1.setPrice(900);
		book1.setPublishedYear(2000);
		book1.setTitle("book10");
		
		// use getDetails
		System.out.println();
		System.out.println("Display book1 details using displayBookDetails method after modifying with setters:");
		book1.displayBookDetails();
		
		// display book list
		System.out.println();
		BookDTO.displayAllBooks();
	}

}
