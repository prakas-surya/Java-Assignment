package library.transactions;

import library.books.Book;
import library.members.Member;

import java.util.Date;

public class Transaction {
    private Book book;
    private Member member;
    private Date borrowDate;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.borrowDate = new Date(); // Current date
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "book=" + book.getTitle() +
               ", member=" + member.getName() +
               ", borrowDate=" + borrowDate +
               '}';
    }
}
