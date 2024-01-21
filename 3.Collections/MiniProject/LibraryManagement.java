import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("List of books in the library:");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    public void searchBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found in the library.");
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search for a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter the title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
