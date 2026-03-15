package ManajemenPerpustakaan;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // default
    }

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }

    // Method untuk meminjam buku
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Method untuk mengembalikan buku
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
}
