import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "12345");
        Book book2 = new Book("1984", "George Orwell", "67890");

        // Create members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        // Transactions
        List<Transaction> transactions = new ArrayList<>();

        // Borrow a book
        if (book1.isAvailable()) {
            book1.borrowBook();
            transactions.add(new Transaction(book1, member1));
        }

        // Return a book
        book1.returnBook();

        // Borrow another book
        if (book2.isAvailable()) {
            book2.borrowBook();
            transactions.add(new Transaction(book2, member2));
        }

        // Display all transactions
        System.out.println("Library Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
