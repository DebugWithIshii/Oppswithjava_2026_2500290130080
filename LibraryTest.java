public class LibraryTest {

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");

        Book b2 = new Book("OOP Concepts", "A. Writer", 450.0, "ISBN002");

        System.out.println("Book 1 Title: " + b1.getTitle());
        System.out.println("Book 1 Author: " + b1.getAuthor());
        System.out.println("Book 1 Price: " + b1.getPrice());
        System.out.println("Book 1 ISBN: " + b1.getIsbn());

        System.out.println();

        System.out.println("Book 2 Title: " + b2.getTitle());
        System.out.println("Book 2 Author: " + b2.getAuthor());
        System.out.println("Book 2 Price: " + b2.getPrice());
        System.out.println("Book 2 ISBN: " + b2.getIsbn());

        System.out.println();

        System.out.println("Total Books: " + Book.bookCount);
        System.out.println("Library Name: " + b1.libraryName);
    }
}