package javaTest;

import java.util.ArrayList;
import java.util.List;

class LibraryManagementSystem {
    private static String userType; // static as it's shared
    private static String username;
    private static String password;

    public static void login(String username, String password) {
        System.out.println("Logged in as: " + username);
    }

    public static void register(String username, String password, String userType) {
        LibraryManagementSystem.username = username;
        LibraryManagementSystem.password = password;
        LibraryManagementSystem.userType = userType;
        System.out.println("Registered successfully.");
    }

    public static void logout() {
        System.out.println("Logged out.");
    }
}

class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void verify() {
        System.out.println("User verified.");
    }

    public void checkAccount() {
        System.out.println("Account checked.");
    }

    public void getBookInfo() {
        System.out.println("Fetching book info...");
    }
}

class Librarian {
    private String name;
    private int id;
    private String password;
    private String searchString;

    public Librarian(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public void verifyLibrarian() {
        System.out.println("Librarian verified.");
    }

    public void search(String searchString) {
        System.out.println("Searching for: " + searchString);
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;
    private String publication;

    public Book(String title, String author, String isbn, String publication) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void showDueDate() {
        System.out.println("Showing due date...");
    }

    public void reservationStatus() {
        System.out.println("Checking reservation status...");
    }

    public void feedback() {
        System.out.println("Providing feedback...");
    }

    public void bookRequest() {
        System.out.println("Requesting book...");
    }

    public void renewInfo() {
        System.out.println("Renewing book info...");
    }
}

class Account {
    private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private double fineAmount;

    public int getNoBorrowedBooks() {
        return noBorrowedBooks;
    }

    public void setNoBorrowedBooks(int noBorrowedBooks) {
        this.noBorrowedBooks = noBorrowedBooks;
    }

    public int getNoReservedBooks() {
        return noReservedBooks;
    }

    public void setNoReservedBooks(int noReservedBooks) {
        this.noReservedBooks = noReservedBooks;
    }

    public int getNoReturnedBooks() {
        return noReturnedBooks;
    }

    public void setNoReturnedBooks(int noReturnedBooks) {
        this.noReturnedBooks = noReturnedBooks;
    }

    public int getNoLostBooks() {
        return noLostBooks;
    }

    public void setNoLostBooks(int noLostBooks) {
        this.noLostBooks = noLostBooks;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void calculateFine() {
        System.out.println("Calculating fine...");
    }
}

class LibraryDatabase {
    private List<Book> listOfBooks;

    public LibraryDatabase() {
        this.listOfBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        listOfBooks.add(book);
        System.out.println("Book added to library database.");
    }

    public void deleteBook(Book book) {
        listOfBooks.remove(book);
        System.out.println("Book removed from library database.");
    }

    public void updateBook(Book oldBook, Book newBook) {
        int index = listOfBooks.indexOf(oldBook);
        if (index != -1) {
            listOfBooks.set(index, newBook);
            System.out.println("Book updated in library database.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayBooks() {
        System.out.println("Displaying all books in library:");
        for (Book book : listOfBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void searchBook(String title) {
        for (Book book : listOfBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

class Staff {
    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

class Student extends User {
    private String studentClass;

    public Student(String name, int id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}


public class Library {

	public static void main(String[] args) {
		LibraryManagementSystem.register("admin", "password123", "Librarian");
        LibraryManagementSystem.login("admin", "password123");

        System.out.println();
        Librarian librarian = new Librarian("John", 1, "admin123");

        LibraryDatabase db = new LibraryDatabase();
        Book book = new Book("Java Programming", "Author A", "123456", "XYZ Publications");
        db.addBook(book);
        db.displayBooks();
        
        librarian.search("Java Programming");

        Account account = new Account();
        account.calculateFine();
	}

}
