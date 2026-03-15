package ManajemenPerpustakaan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        while (running) {

            System.out.println("===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    Member member = new Member(memberId, name);
                    library.registerMember(member);
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextLine();

                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextLine();

                    library.borrowBook(memberId, bookId);
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextLine();

                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextLine();

                    library.returnBook(memberId, bookId);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}