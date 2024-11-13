package com.gnmuthu.newlibrarymanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * The BookTransactions class handles the process of borrowing books.
 * It provides methods to view available books and users, and to map a book to a user for borrowing purposes.
 */
public class BookTransactions {

    // Scanner for reading user input
    private final Scanner scanner = new Scanner(System.in);

    // Declaring map variable to store the relationship between user ID and borrowed book ID
    private final Map<String, String> map = new HashMap<>();

    /**
     * Displays available books and users and allows a user to borrow a book.
     * This method shows all book and user details to help identify which items are available.
     * 
     * @param bookInformation contains the list of books available
     * @param userInformation contains the list of registered users
     */
    public void borrowBook(BookInformation bookInformation, UserInformation userInformation) {

        // Getting the list of available books and users
        List<Book> bookBorrow = bookInformation.getBooks();
        List<User> borrower = userInformation.getUsers();

        System.out.println("Information from Borrow Books...");

        // Displaying book information
        System.out.println("Book Info:");
        for (Book book : bookBorrow) {
            System.out.println(book.getBookId() + " " + book.getBookTitle());
        }

        // Displaying user information
        System.out.println("User Info:");
        for (User user : borrower) {
            System.out.println(user.getUserId() + " " + user.getUserName());
        }

        // Initiate the mapping of user to book based on IDs
        mapData(bookInformation, userInformation);
    }

    /**
     * Maps a book to a user based on the provided IDs.
     * It verifies that both the book and user exist, and if so, adds the mapping
     * of user ID to book ID in the map.
     * 
     * @param bookInformation contains the list of books available
     * @param userInformation contains the list of registered users
     */
    private void mapData(BookInformation bookInformation, UserInformation userInformation) {
        boolean userVerification = false;
        boolean bookVerification = false;

        // Getting the list of available books and users
        List<Book> bookBorrow = bookInformation.getBooks();
        List<User> borrower = userInformation.getUsers();

        // Prompting for user and book IDs to borrow
        System.out.println("Enter the User Id:");
        String userId = scanner.nextLine();
        System.out.println("Enter the Book id for Borrow:");
        String bookId = scanner.nextLine();

        // Verifying the existence of the user ID in the user list
        for (User userElement : borrower) {
            if (userElement.getUserId().equals(userId)) {
                userVerification = true;
                break;
            }
        }

        // Verifying the existence of the book ID in the book list
        for (Book bookElement : bookBorrow) {
            if (bookElement.getBookId().equals(bookId)) {
                bookVerification = true;
                break;
            }
        }

        // If both user and book are valid, add the mapping to the map
        if (userVerification && bookVerification) {
            map.put(userId, bookId);
        }

        // Displaying all user-book mappings
        for (Map.Entry<String, String> userBook : map.entrySet()) {
            System.out.println(userBook.getKey() + " " + userBook.getValue());
        }
    }
}
