package com.gnmuthu.newlibrarymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The BookInformation class manages a collection of Book objects.
 * It allows users to enter new books and displays the list of available books.
 */
public class BookInformation {

    private static List<Book> books = new ArrayList<>();

    /**
     * Retrieves the list of books available.
     *
     * @return the list of books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Prompts the user to enter book details (title, author, publisher, and ID)
     * and adds the new Book to the list of available books.
     * Displays all the books after adding the new book.
     */
    public void bookEntry() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Book Title");
        String bookTitle = scanner.nextLine();
        
        System.out.println("Enter Author Name");
        String authorName = scanner.nextLine();
        
        System.out.println("Enter Publishers Name");
        String publisherName = scanner.nextLine();
        
        System.out.println("Enter Book Id");
        String bookId = scanner.nextLine();
        
        scanner.close();

        // Create a new Book object and add it to the list
        Book myBook = new Book(bookTitle, authorName, publisherName, bookId);
        System.out.println(myBook.getAuthorName());
        books.add(myBook);
        
        // Display all available books
        System.out.println("List of Available books:");
        for (Book book : books) {
            System.out.println(book.getBookTitle());
        }
    }
}

/**
 * The Book class represents a book with a title, author, publisher, and ID.
 */
class Book {
	
    private String bookTitle;
    private String authorName;
    private String publisherName;
    private String bookId;

    /**
     * Constructs a new Book with the specified title, author, publisher, and ID.
     *
     * @param bookTitle the title of the book
     * @param authorName the author of the book
     * @param publisherName the publisher of the book
     * @param bookId the unique ID of the book
     */
    public Book(String bookTitle, String authorName, String publisherName, String bookId) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.bookId = bookId;
    }

    /**
     * Gets the title of the book.
     *
     * @return the book title
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the title of the book.
     *
     * @param bookTitle the new title of the book
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author name
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Sets the author of the book.
     *
     * @param authorName the new author of the book
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * Gets the publisher of the book.
     *
     * @return the publisher name
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the publisher of the book.
     *
     * @param publisherName the new publisher of the book
     */
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    /**
     * Gets the unique ID of the book.
     *
     * @return the book ID
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * Sets the unique ID of the book.
     *
     * @param bookId the new ID of the book
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
