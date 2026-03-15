package ManajemenPerpustakaan;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully.");
    }

    public Book findBookById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public void borrowBook(String memberId, String bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        book.borrow();
        member.borrowBook(book);

        System.out.println("Book borrowed successfully by " + member.getName());
    }

    public void returnBook(String memberId, String bookId) {

        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member == null || book == null) {
            System.out.println("Invalid member or book.");
            return;
        }

        if (!book.isBorrowed()) {
            System.out.println("Book is not currently borrowed.");
            return;
        }

        book.returnBook();
        member.returnBook(book);

        System.out.println("Book returned successfully.");
    }
}
