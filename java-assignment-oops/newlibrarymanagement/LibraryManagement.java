package com.gnmuthu.newlibrarymanagement;

import java.util.Objects;
import java.util.Scanner;

/**
 * The LibraryManagement class handles the overall functionality of the library system.
 * It provides methods for user authentication, book and user entry, and managing book borrowing transactions.
 */
public class LibraryManagement {

    // Instances of other classes for handling book, user information, and transactions
    private final BookInformation bookInformation = new BookInformation();
    private final UserInformation userInformation = new UserInformation();
    private final BookTransactions bookTransactions = new BookTransactions();
    
    // Scanner for reading user input
    private final Scanner scanner = new Scanner(System.in);

    /**
     * This method prompts the admin for username and password verification before proceeding to the main options menu.
     * If the credentials are correct, it proceeds to show the menu. Otherwise, it shows an error message.
     */
    void init() {
        System.out.println("Enter User Name");
        String adminUserName = scanner.nextLine();
        System.out.println("Enter Password");
        String adminPassword = scanner.nextLine();

        // Verifying the admin credentials (hard coded)
        if (Objects.equals(adminUserName, "nadimuthu") && adminPassword.equals("12345")) {
            listOption(); // Proceed to the list of options after successful verification
        } else {
            System.out.println("Either User Name or Password is incorrect"); // Display error if credentials are wrong
        }
    }

    /**
     * After successful login, this method is called to show the list of options available to the admin.
     * Admin can perform actions such as adding books, adding users, and borrowing books.
     */
    private void listOption() {

        // Infinite loop to keep showing the options menu until exit
        while (true) {
            System.out.println("Enter any one option from the list:");
            System.out.println("1. Book Entry");
            System.out.println("2. User Entry");
            System.out.println("3. Borrow Books");
            System.out.println("4. Exit");

            // Reading the option selected by the admin
            int option = scanner.nextInt();

            // Switch-case to handle different actions based on the selected option
            switch (option) {
                case 1 -> bookInformation.bookEntry(); // Call book entry method
                case 2 -> userInformation.userEntry(); // Call user entry method
                case 3 -> bookTransactions.borrowBook(bookInformation, userInformation); // Handle book borrowing
                case 4 -> System.exit(0); // Exit the program
                default -> System.out.println("Enter the correct option..."); // Display error for invalid option
            }
        }
    }

    /**
     * Main method to run the LibraryManagement application.
     * It initializes the library system by calling the init() method.
     */
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        library.init(); // Initialize the library system
    }

    /**
     * This is a placeholder class for any future listeners related to book selection.
     * Currently, it is empty but can be used for further development.
     */
    public static class OnBooksSelectedListener {
        // Placeholder for future implementation
    }
}
