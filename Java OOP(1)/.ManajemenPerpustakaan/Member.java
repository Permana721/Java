package ManajemenPerpustakaan;

import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    private List<Book> borrowedBooks;

    public Member(String id, String name) {
        borrowedBooks = new ArrayList<>();
        super(id, name);
    }

    @Override
    public String getInfo() {
        return "Member ID: " + getId() + ", Name: " + getName();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}