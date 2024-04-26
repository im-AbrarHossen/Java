import java.util.Scanner;

class Book implements Comparable<Book> {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;

    public Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        this.count = 0;
    }

    public Book() {
        this.ISBN = 0;
        this.bookTitle = "";
        this.numberOfPages = 0;
        this.count = 0;
    }

    public int compareTo(Book otherBook) {
        if (this.numberOfPages > otherBook.numberOfPages) {
            return 1;
        } else if (this.numberOfPages == otherBook.numberOfPages) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getCount() {
        return count;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", bookTitle=" + bookTitle + ", numberOfPages=" + numberOfPages + ", count=" + count + "]";
    }
}

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            System.out.print("ISBN: ");
            int ISBN = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Book Title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Number of Pages: ");
            int numberOfPages = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            books[i] = new Book(ISBN, bookTitle, numberOfPages);
        }

        System.out.println("All Book objects: ");
        displayAll(books);

        // Compare two books based on the number of pages
        Book book1 = books[0];
        Book book2 = books[1];
        int comparisonResult = book1.compareTo(book2);
        System.out.println("Comparison result: " + comparisonResult);

        // Demonstrate isHeavier() method
        System.out.println("Is the first book heavier (more than 500 pages)? " + isHeavier(books[0]));
        System.out.println("Is the second book heavier (more than 500 pages)? " + isHeavier(books[1]));

        scanner.close();
    }

    public static void displayAll(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public static boolean isHeavier(Book book) {
        return book.getNumberOfPages() > 500;
    }
}